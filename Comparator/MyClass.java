package Comparator;

import java.util.Comparator;

public class MyClass implements Comparator<Integer>{
    public static void main(String[] args) {
      
    }

    @Override
    public int compare(Integer a, Integer b) {
      // TODO Auto-generated method stub
      return b-a; // Descending Sorting
    }
}
