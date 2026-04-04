package Comparator;
import java.util.*;
class Main{
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    
    // Sorting the list in the descending order using comparator
    //Collections.sort(list,new MyClass());
    // We can use lambda express instead of creating the new class which is MyClass
    Collections.sort(list,(a,b)->b-a); //(Lambda Function)
    System.out.println(list);

  }
}