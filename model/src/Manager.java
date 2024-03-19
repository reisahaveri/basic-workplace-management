public class Manager extends Employee{

    private Double salary;

    public Manager(int id, String name, String surname, Double salary) {
        super(name, surname, id);
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", salary=" + salary +
                ", id=" + super.getId() +
                '}';
    }

}
