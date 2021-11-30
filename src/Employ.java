import java.util.ArrayList;
import java.util.*;
public class Employ {
    int age;
    long empId, salary;
    String empFirstname, empLastname, empAddress, skills;

    public Employ(int age, long empId, long salary, String empFirstname, String empLastname, String empAddress, String skills) {
        this.age = age;
        this.empId = empId;
        this.salary = salary;
        this.empFirstname = empFirstname;
        this.empLastname = empLastname;
        this.empAddress = empAddress;
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public long getEmpId() {
        return empId;
    }

    public long getSalary() {
        return salary;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public String getSkills() {
        return skills;
    }
}
class Employe{
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<>();
        Employ emp1 = new Employ(23,25,23000,"sai","kottu","bhimavaram","c++");
        Employ emp2 = new Employ(22,27,23500,"phani","adabala","vijayawada","java");
        employList.add(emp1);
        employList.add(emp2);
        List<Employ> tempList = new ArrayList<>();
        for(Employ e : employList){
            if("c++".equalsIgnoreCase(e.getSkills())){
                tempList.add(e);
            }
        }
        for(Employ e : tempList){
            System.out.println(e.getEmpFirstname()+" "+e.getEmpLastname());
        }
        HashMap<Long ,String> employMap = new HashMap<>();
        employList.forEach(emp->{
            employMap.put(emp.getEmpId(),emp.getEmpFirstname());
        });
        employMap.keySet().stream().forEach(System.out::println);
        employMap.values().stream().forEach(System.out::println);
    }
}
