package UnaryOperator;

import java.util.function.Function;

public class UnaryOperator {
  public static void main(String[] args) {
    Function<Integer,Integer> squareOfnumber = x->x*x;
    // In the above function input type and output type both is integer in that case we can use the Unary Function
    java.util.function.UnaryOperator<Integer> cubeOfNumber = x->x*x*x;
    System.out.println(cubeOfNumber.apply(3));
    
  }
}
