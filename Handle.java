import java.util.ArrayList;

public class Handle {
    private ArrayList<Employee> list;

    public Handle(){
        list = new ArrayList<Employee>();
    }

    public void add(Employee employee){
        this.list.add(employee);
    }

    //Add 3 Employee
    public void addEmployee(){
        for (int i=0; i<3; i++){
            System.out.println(String.format("Enter information (%d/%d)", i+1, 3));
            Employee employee = new Employee();
            employee.AddInformation();
            this.add(employee);
        }
    }

    //Print 3 Employee
    public void printEmployee(){
        System.out.println("Print 3 Employee");
        for(Employee employee: list){
            employee.OutInformation();
            System.out.println("______");
        }
    }

    //Seniority>=20 or Coefficient>8

    public void Check(){
        System.out.println("Print employee has Seniority>=20 or Coefficient>8: ");
        for (Employee employee : list){
            if(employee.getSeniority() >= 20 || employee.getCoefficient()>8){
                employee.OutInformation();
                System.out.println("____");
            }
        }
    }

    //Max
    public void Max(){
        System.out.println("Print Employee has the highest salary: ");
        double max = 0.0;
        for (Employee employee: list){
            if(employee.Salary()>max)
                max = employee.Salary();
        }
        for (Employee employee: list){
            if(max == employee.Salary())
                employee.OutInformation();
        }

    }


}
