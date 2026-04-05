package ConstructorRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Student{
    String name;

    public Student (String name){
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
class Main{
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice","Bob","Charlie");
    // List<Student> student = names.stream().map(x->new Student(x)).collect(Collectors.toList()); // Instead of these we can use the constructor refrence
    List<Student> student = names.stream().map(Student::new).collect(Collectors.toList());
    System.out.println("Student list "+" "+student);
    
  }
}