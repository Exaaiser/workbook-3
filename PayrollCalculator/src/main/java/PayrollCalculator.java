import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file employee file to process");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to crate");
        String outputFileName = scanner.nextLine();

        List<Employee> employees = new ArrayList<>();

        try
        {
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            bufReader.readLine();

            while ((input = bufReader.readLine()) != null) {
    String[] tokens = input.split("\\|");

                String employeeId = tokens[0];
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

            Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                employees.add(employee);

            System.out.printf("ID: %s | Name: %s | Gross Pay: %.2f%n",
                    employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

        }
        bufReader.close();
        } catch (IOException e) {
            System.out.println("File Reading Error" + e.getMessage());
        }
        if (outputFileName.endsWith(".json")) {
            writeJson(employees, outputFileName);
        } else {
            writeCsv(employees, outputFileName);
        }

        System.out.println("Payroll file created: " + outputFileName);
    }
    private static void writeCsv(List<Employee> employees, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("id|name|gross pay\n");

            for (Employee emp : employees) {
                writer.write(emp.getEmployeeId() + "|" + emp.getName() + "|" + String.format("%.2f", emp.getGrossPay()) + "\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e.getMessage());
        }
    }
    private static void writeJson(List<Employee> employees, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("[\n");

            for (int i = 0; i < employees.size(); i++) {
                Employee emp = employees.get(i);
                writer.write(String.format("  { \"id\": \"%s\", \"name\" : \"%s\", \"grossPay\" : %.2f }",
                        emp.getEmployeeId(), emp.getName(), emp.getGrossPay()));
                if (i < employees.size() - 1) writer.write(",\n");
                else writer.write("\n");
            }

            writer.write("]");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing JSON file: " + e.getMessage());
        }
    }
}