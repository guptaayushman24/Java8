package Comparator;

import java.util.ArrayList;
import java.util.Collections;

class Pair {
  int x;
  String y;
  Pair (int x,String y){
    this.x = x;
    this.y = y;
  }
  @Override
  public String toString(){
    return this.x +" "+this.y;
  }
}
class Student{
  public static void main(String[] args) {
    Pair p1 = new Pair(1, "ABCD");
    Pair p2 = new Pair(2,"EFGH");
    
    ArrayList<Pair> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);

     System.out.println("Before Sorting" +" "+list);

    Collections.sort(list,(a,b)->b.x-a.x);

    System.out.println("After Sorting" +" "+list);
  }
}