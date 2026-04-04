package MethodRefrence;

import java.util.ArrayList;

public class MethodRefrence {
  public static void print (String s){
    System.out.println(s);
  }
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("John");
    names.add("Kay");
    names.add("Menon");

    // names.forEach(x->System.out.println(x)); // Instead of these we can call the Method Refrence
    names.forEach(MethodRefrence::print);

  }
}
