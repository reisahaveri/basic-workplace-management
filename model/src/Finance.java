public class Finance extends Employee{

    private String attribute1;

    public Finance(String name, String surname, String attribute1) {
        super(name, surname);
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
}
