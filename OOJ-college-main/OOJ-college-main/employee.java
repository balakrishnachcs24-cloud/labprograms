public class employee {
    private int empId;
    private String name;
    private double salary;

    public employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        employee emp = new employee(101, "Ashrith", 50000);
        emp.display();
    }
}

