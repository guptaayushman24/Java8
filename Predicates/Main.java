package Predicates;

import java.util.function.Predicate;

class Student {
  int id;
  String name;

  Student (int id,String name){
    this.id = id;
    this.name = name;
  }

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

  public static int getId(int id){
    return id;
  }
}
class Main{
  public static void main(String[] args) {
    Predicate<Integer> salaryGreaterThanOneLac = x->x>1000000;
    System.out.println(salaryGreaterThanOneLac.test(1));
    System.out.println(salaryGreaterThanOneLac.test(1000000000));

    int salary = 90;
    if (salaryGreaterThanOneLac.test(salary)){
      System.out.println("True");

      Predicate<Integer> isEven = x->x%2==0;
      if (isEven.test(2)){
        System.out.println("Even Number");
      }
      else{
        System.out.println("Odd Number");
      }
    }

    Predicate<String> startsWithLetterV = str->str.startsWith("V");
    String str = "Vertty";
    if (startsWithLetterV.test(str)){
      System.out.println("String start with V");
    }
    else{
      System.out.println("String do not start with V");
    }

    // AND Predicate
    Predicate<String> startsWithLetterA = str1->str1.toLowerCase().startsWith("a");
    Predicate<String> startsWithLetterB = str2->str2.toLowerCase().endsWith("b");

    if (startsWithLetterA.and(startsWithLetterB).test("ab")){
      System.out.println("String starts with letter a and ends with letter b");
    }
    else{
      System.out.println("String do not starts with letter a and ends with letter b");
    }

    // OR Predicate
    if (startsWithLetterA.or(startsWithLetterB).test("ac")){
       System.out.println("String either starts with letter a and either ends with letter c");
    }
    else{
       System.out.println("String do not starts with letter a and ends with letter c");
    }

    // Predicate on class
    Student s1 = new Student(1, "Alice");
    Student s2 = new Student(2, "John");
    Predicate<Student> student = s->s.getId()>1;
    System.out.println(student.test(s1));

    // Equals Predicate
     Predicate<Object> equalPredicate = Predicate.isEqual("Hello");
     if (equalPredicate.test("Hello")){
       System.out.println("Predicate is equal run");
     }
    }
}