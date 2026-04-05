package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // Imperative Approach
    int [] array = {1,2,3,4,5};
    int sum = 0;
    for (int i=0;i<array.length;i++){
      if (array[i]%2==0){
        sum = sum+array[i];
      }
    }
    System.out.println(sum);
    // Stream
    int [] array2 = {1,2,3,4,5};
    int sum2 = Arrays.stream(array2).filter(x->x%2==0).sum();
    System.out.println(sum2);

    // How to convert the list into stream
  List<String> list = Arrays.asList("apple","banana","cherry");
  Stream<String> myStream = list.stream();

  // How to convert the array into stream
  String [] arrayFruit = {"apple","banana","cherry"};
  Stream<String> stream = Arrays.stream(arrayFruit);

  Stream<Integer> integerStream = Stream.of(1,2,3);
  Stream<Integer> limit = Stream.iterate(0,n->n+1).limit(100);
  Stream<Integer> limit1 = Stream.generate(()->(int)Math.random()*100).limit(5);

  // Stream Operation
  List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,4323,9,0,5,44,23,433);
  
  List<Integer> numberListFilterStream = numberList.stream().filter(x->x%2==0).collect(Collectors.toList());
  System.out.println("Even Number" +" "+numberListFilterStream);

  List<Integer> numberOfSquare = numberList.stream().map(x->x*x).collect(Collectors.toList());
  System.out.println("Square of list of number is"+" "+numberOfSquare);
  }

  
  

}
