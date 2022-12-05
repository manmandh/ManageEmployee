import java.util.Scanner;

public class Employee {
    private String FullOfName;
    private int year;
    private int coefficient;
    private int seniority;

    public Employee(){

    }

    public Employee(String fullOfName, int year, int coefficient, int seniority) {
        this.FullOfName = fullOfName;
        this.year = year;
        this.coefficient = coefficient;
        this.seniority = seniority;
    }

    public String getFullOfName() {
        return FullOfName;
    }
    public void setFullOfName(String fullOfName) {
        this.FullOfName = fullOfName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getCoefficient() {
        return coefficient;
    }
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
    public int getSeniority() {
        return seniority;
    }
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public void AddInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input information for employee:");
        System.out.print("Full of name: ");
        FullOfName = sc.nextLine();
        System.out.print("Input year: ");
        year = sc.nextInt();
        System.out.print("Input coefficient: ");
        coefficient = sc.nextInt();
        System.out.print("Input seniority: ");
        seniority = sc.nextInt();
    }
    public int Salary() {
        return coefficient * 150000 + seniority *30000;
    }
    public void OutInformation()
    {
        System.out.println("Full of name: " +getFullOfName()+", Year: " + getYear() +", Coefficient: " + getCoefficient() + ", Seniority: " + getSeniority());
    }
}
