public class Finance extends Employee{

    private String attribute1;

    public Finance(String name, String surname, String attribute1, int id) {
        super(name, surname, id);
        this.attribute1 = attribute1;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public void printInfo() {
        System.out.println("finance created");

    }

    @Override
    public String toString() {
        return "Finance{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname()+ '\'' +
                ", status=" + attribute1 +
                '}';
    }

}
