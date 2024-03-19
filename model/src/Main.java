import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        //add employee info
        System.out.println("add employee name");
        String empName = scanner.nextLine();
        System.out.println(empName);

        Manager manager = new Manager(12345, "jack","suave", 2560.90);
        System.out.println(manager.getSalary()+" "+ manager.getName()+" "+manager.getSurname());
        manager.printInfo();

        Group group = new Group();
        group.addMembers(new Finance("semi","oupa", "new",1));
        group.addMembers(new Manager(12346, "sonya","kirk", 5678.90));
        Employee member = group.findEmployee(12346);
        System.out.println("found member is "+member);
        group.removeMembers(member);

        group.printGroup();

    }
}