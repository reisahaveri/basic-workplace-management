public class Manager extends Employee{

    private Float salary;

    public Manager(String id, String name, String surname, Float salary) {
        super(name, surname);
        this.salary =salary;

    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("new manager created");
    }
}
