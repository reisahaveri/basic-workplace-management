import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        //add employee info
        System.out.println("add employee name");
        String empName = scanner.nextLine();
        System.out.println(empName);

        Manager manager = new Manager("12345", "jack","suave", 2560.90);
        System.out.println(manager.getSalary()+" "+ manager.getName()+" "+manager.getSurname());
        manager.printInfo();

    }
}