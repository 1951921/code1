import java.util.ArrayList;
import java.util.List;
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

    public void setAge(int age) {
        this.age = age;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public void setEmpFirstname(String empFirstname) {
        this.empFirstname = empFirstname;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public void setEmpLastname(String empLastname) {
        this.empLastname = empLastname;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
class Employe{
    public static void main(String[] args) {
        Employ emp1 = new Employ(23,25,23000,"sai","kottu","bhimavaram","c++");
        Employ emp2 = new Employ(22,27,23500,"mani","kott","vijayawada","java");
        System.out.println(emp1.getEmpFirstname());
        List<Employ> employList = new ArrayList<>();
        employList.add(new Employ(23,25,23000,"sai","kottu","bhimavaram","c++"));
        employList.add(new Employ(22,27,22500,"manikanta","kott","vijayawada","java"));
        List<Employ> tempList = new ArrayList<>();
        for(Employ e : employList){
            if("c++".equalsIgnoreCase(e.getSkills())){
                tempList.add(e);
            }
        }
        for(Employ e : tempList){
            System.out.println(e.getEmpFirstname()+" "+e.getEmpLastname());
        }
    }
}

