public class Manager extends Employee{

    private Double salary;

    public Manager(String id, String name, String surname, Double salary) {
        super(name, surname);
        this.salary =salary;

    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("new manager created");
    }
}
