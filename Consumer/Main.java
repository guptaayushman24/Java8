package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    Consumer<String> consumer = s->System.out.println(s);
    consumer.accept("Hello"); 


    Consumer<List<Integer>> listConsumer = li->{
      for (int i:li){
        System.out.println(i+100);
      }
    };
    listConsumer.accept(Arrays.asList(1,2,3,4));

    Consumer<List<Integer>> liConsumer = li->{
      for (Integer i:li){
        System.out.println(i);
      }
    };
    liConsumer.andThen(listConsumer).accept(Arrays.asList(1,2,3,4));
  }
}
