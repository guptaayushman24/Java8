package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
class Student{
  int id;
  String name;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
}
public class Main {
  public static void main(String[] args) {
    // Function Syntax => Function<Input,Output>
    Function<String,Integer> functionGetLength = x->x.length();
    System.out.println(functionGetLength.apply("Hello"));

    Function<String,String> startingThreeLetter = x->x.substring(0,3);
    System.out.println(startingThreeLetter.apply("Alice"));
    
    List<Student> list = new ArrayList<>();
    Function<List<Student>,List<Student>> studentStartsWithVip = li->{
      for (Student s:li){
        if (s.getName().substring(0,2).equals("vip")){
          list.add(s);
        }
      }
      return li;
    };

    // Function Chaning
    Function<String,String> function1 = s->s.toUpperCase();
    Function<String,String> function2 = s->s.substring(0,3);
    
    Function<String,String> stringStringFunction = function1.andThen(function2);
    System.out.println(stringStringFunction.apply("Vipul"));

    Function<Integer,Integer> multiply = x->2*x;
    Function<Integer,Integer> cube = x->x*x*x;

    // andThen
    System.out.println(multiply.andThen(cube).apply(2));
    System.out.println(cube.andThen(multiply).apply(2));

    // compose
    System.out.println(multiply.compose(cube).apply(2));// These is equivalent to these System.out.println(cube.andThen(multiply).apply(2));

    // Identity
    Function<String,String> identityFunction = Function.identity();
    System.out.println(identityFunction.apply("Vipul"));
  }
}
