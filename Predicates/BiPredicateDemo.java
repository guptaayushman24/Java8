package Predicates;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
  public static void main(String[] args) {
    BiPredicate<Integer,Integer> checkBothNumberAreEven = (x,y)->x%2==0 && y%2==0;

    if (checkBothNumberAreEven.test(2,4)){
      System.out.println("Both numbers are even");
    }
    else if (checkBothNumberAreEven.test(1,3)){
      System.out.println("Both Numbers are odd");
    }

  }
}
