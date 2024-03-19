import java.util.ArrayList;

public class Group {

    ArrayList<Employee> members = new ArrayList<>();

    public void addMembers(Employee employee){
        members.add(employee);
    }

    public void removeMembers( Employee employee){
        members.remove(employee);
    }

    public Employee findEmployee(int id){
        for(Employee member : members) {
            if(member.getId() == id ) {
                return member;
            }
        }
        return null;

    }


    public void printGroup(){
        for (Employee member : members) {
            System.out.println(member);
        }

    }
}
