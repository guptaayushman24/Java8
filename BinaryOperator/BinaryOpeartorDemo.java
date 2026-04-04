package BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOpeartorDemo {
  public static void main(String[] args) {
    BiFunction<String,String,String> binaryFunction = (x,y)->x+y;
    // Here we can use BinaryOperator because input and output are same
    BinaryOperator<String> binaryOperator = (x,y)->x+y;
    System.out.println(binaryOperator.apply("Hello", "Hii"));
  }
}
