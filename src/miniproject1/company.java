package miniproject1;



import java.util.*;

public class company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask how many employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Declare arrays
        int[] empNo = new int[n];
        String[] empName = new String[n];
        String[] joinDate = new String[n];
        char[] desigCode = new char[n];
        String[] department = new String[n];
        int[] basic = new int[n];
        int[] hra = new int[n];
        int[] it = new int[n];

        // Step 3: Input details for each employee
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Employee Number: ");
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input! Please enter a number: ");
                sc.next();
            }
            empNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Join Date (dd/mm/yyyy): ");
            joinDate[i] = sc.nextLine();

            System.out.print("Designation Code (e/c/k/r/m): ");
            desigCode[i] = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Department: ");
            department[i] = sc.nextLine();

            System.out.print("Basic: ");
            basic[i] = sc.nextInt();

            System.out.print("HRA: ");
            hra[i] = sc.nextInt();

            System.out.print("IT: ");
            it[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Step 4: Print all employee records in table format
        System.out.println("\n============= All Employee Records =============");
        System.out.printf("%-10s %-10s %-15s %-15s %-15s %-10s\n",
            "EmpNo", "Name", "Join Date", "Designation", "Department", "Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            String designation = "";
            int da = 0;

            switch (desigCode[i]) {
                case 'e':
                    designation = "Engineer";
                    da = 20000;
                    break;
                case 'c':
                    designation = "Consultant";
                    da = 32000;
                    break;
                case 'k':
                    designation = "Clerk";
                    da = 12000;
                    break;
                case 'r':
                    designation = "Receptionist";
                    da = 15000;
                    break;
                case 'm':
                    designation = "Manager";
                    da = 40000;
                    break;
                default:
                    designation = "Unknown";
                    da = 0;
            }

            int salary = basic[i] + hra[i] + da - it[i];

            System.out.printf("%-10d %-10s %-15s %-15s %-15s %-10d\n",
                empNo[i], empName[i], joinDate[i], designation, department[i], salary);
        }
        System.out.println("==============================================================");

        // Step 5: Ask which employee to search
        System.out.print("\nEnter Employee ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (empNo[i] == searchId) {
                found = true;
                String designation = "";
                int da = 0;

                switch (desigCode[i]) {
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                        da = 0;
                }

                int salary = basic[i] + hra[i] + da - it[i];

                // Display individual employee details
                System.out.println("\n=========== Employee Details ===========");
                System.out.println("Emp No      : " + empNo[i]);
                System.out.println("Name        : " + empName[i]);
                System.out.println("Join Date   : " + joinDate[i]);
                System.out.println("Designation : " + designation);
                System.out.println("Department  : " + department[i]);
                System.out.println("Salary      : " + salary);
                System.out.println("========================================");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        sc.close();
    }
}
