@FunctionalInterface
public interface MyInterface { // Functional Interface
    public void sayHello();
    default void sayBye(){};
}