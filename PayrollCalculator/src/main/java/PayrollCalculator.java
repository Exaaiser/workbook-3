import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        try
        {
            FileReader fileReader = new FileReader("employees.csv");
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

            System.out.printf("ID: %s | Name: %s | Gross Pay: %.2f%n",
                    employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

        }
        bufReader.close();
        } catch (IOException e) {
            System.out.println("File Reading Error" + e.getMessage());
        }

        }
        }