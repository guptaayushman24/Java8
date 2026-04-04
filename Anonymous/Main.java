package Anonymous;

public class Main{
  public static void main(String[] args) {
    SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();
    System.out.println(softwareDeveloper.getSalary());

    // Do not create the seperate implementation class
    // These is the annoymous class
    Employee employee = new Employee(){
      @Override
      public String getSalary(){
        return "10000";
      }

      @Override
      public String getDesignation(){
        return "Software Developer";
      }
    };

    System.out.println(employee.getDesignation());
  }
  
}
