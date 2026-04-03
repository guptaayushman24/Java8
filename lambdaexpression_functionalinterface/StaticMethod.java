interface A{
    static void sayHello(){
        System.out.println("Hello !");
    }
    default void sayBye(){
        System.out.println("Byee");
    }
}
public class StaticMethod implements A{
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
       // To call the static method which is present inside the interface
       A.sayHello();
       obj.sayBye();
    }
}
