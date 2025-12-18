class SharedResource {
    private int data;
    private boolean hasData = false;

    // Producer method
    synchronized void produce(int value) {
        while (hasData) {   // If data already exists, wait
            try {
                wait();
            } catch (Exception e) {}
        }

        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify();  // Wake up consumer
    }

    // Consumer method
    synchronized int consume() {
        while (!hasData) {   // If no data, wait
            try {
                wait();
            } catch (Exception e) {}
        }

        System.out.println("Consumed: " + data);
        hasData = false;
        notify();   // Wake up producer
        return data;
    }
}

// Producer Thread
class Producer extends Thread {
    SharedResource obj;

    Producer(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            obj.produce(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedResource obj;

    Consumer(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            obj.consume();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

// Main Class
public class WaitNotifyIPC {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
}
