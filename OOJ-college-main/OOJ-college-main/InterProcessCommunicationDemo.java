
class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try { wait(); } catch (InterruptedException e) {}
        }
        empty = true;
        notify();
        return message;
    }

    public synchronized void write(String msg) {
        while (!empty) {
            try { wait(); } catch (InterruptedException e) {}
        }
        empty = false;
        message = msg;
        notify();
    }
}

public class InterProcessCommunicationDemo {
    public static void main(String[] args) {

        Message message = new Message();

        Thread writer = new Thread(() -> {
            String[] messages = { "Hello", "This is IPC", "Using wait/notify", "Bye" };
            for (String msg : messages) {
                message.write(msg);
                System.out.println("Writer wrote: " + msg);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                String msg = message.read();
                System.out.println("Reader read: " + msg);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });

        writer.start();
        reader.start();
    }
}