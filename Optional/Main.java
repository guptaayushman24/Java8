package Optional;

import java.lang.foreign.Linker.Option;
import java.util.Optional;

public class Main {
  private static Optional<String> getName (int id){
    // get from db
    String name = "Ram";
    return Optional.of(name);
  }
    public static void main(String[] args) {
      Optional<String> name = getName(2);
      if (name.isPresent()){
        System.out.println(name.get());
      }

      name.ifPresent(x->System.out.println(x));
      
    }
}
