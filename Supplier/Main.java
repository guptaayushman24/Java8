package Supplier;

import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    // Supplier holds the lambda expression
    Supplier<Integer> supplier = ()->1;
    System.out.println(supplier.get());
  }
}
