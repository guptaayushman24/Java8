package LambdaExpression;
public class Main {
    public static void main(String[] args) {
        // SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();
        // System.out.println(softwareDeveloper.getName());

        EmployeeInterface employeeInterface = ()-> "Software Enginner";
        System.out.println(employeeInterface.getName());

        // Function Interface => EmployeeInterface
        // Lambda Experession => "Software Enginner";

    }
}
