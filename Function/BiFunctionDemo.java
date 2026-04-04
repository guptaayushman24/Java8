package Function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
  public static void main(String[] args) {
    BiFunction<String,String,Integer> biFunction = (x,y)->x.length()+y.length();
    System.out.println(biFunction.apply("Hello", "Hii"));
  }
}
