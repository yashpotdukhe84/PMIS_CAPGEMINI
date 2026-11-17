
class employee {
    double salary = 30000;
}

class manager extends employee {
    double salary = 60000;

    void displaysalary() {
        System.out.println("Manager salary: " + salary);
        System.out.println("Employee salary: " + super.salary);
    }
}

public class superkeyword {
    public static void main(String[] args) {
        manager m = new manager();
        m.displaysalary();
    }
}
