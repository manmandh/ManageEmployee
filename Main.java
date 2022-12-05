import java.util.Scanner;

public class Main {
    public  static  void  DisplayInformation(){
        System.out.println("___Please choose function___");
        System.out.println(" 1.Add information for 3 employees: ");
        System.out.println(" 2.Print information for 3 employees: ");
        System.out.println(" 3.Check seniority and coefficient: ");
        System.out.println(" 4.Print Employee has the highest salary: ");
        System.out.println(" 5.Find By FirstName: ");
        System.out.println(" 6.Quit system: ");
    }
    public static void main(String[] args) {
        Handle handle = new Handle();
        Scanner scanner = new Scanner(System.in);
        boolean programmeFlag = true;
        while(programmeFlag){
            try {
                Main.DisplayInformation();
                int choice =Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:
                        handle.addEmployee();
                        break;
                    case 2:
                        handle.printEmployee();
                        break;
                    case 3:
                        handle.Check();
                        break;
                    case 4:
                        handle.Max();
                        break;
                    case 5:
                        System.out.println("Enter the firstname: ");
                        String firstName = scanner.nextLine();
                        handle.fidByFirstName(firstName);
                        break;
                    case 6:
                        System.out.println("Quit system");
                        break;
                    default:
                        System.err.println("Wrong");
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Error, restart menu");

            }
        }

    }
}