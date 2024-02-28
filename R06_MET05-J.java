//Rule 06: User example

//MET05-J

//Defective Code:
class SuperClass {
  public SuperClass () {
    doLogic();
  }
 
  public void doLogic() {
    System.out.println("This is superclass!");
  }
}
 
class SubClass extends SuperClass {
  private String color = "red";
 
  public void doLogic() {
    System.out.println("This is subclass! The color is :" + color);
    // ...
  }
}
 
public class Overridable {
  public static void main(String[] args) {
    SuperClass bc = new SuperClass();
    // Prints "This is superclass!"
    SuperClass sc = new SubClass();
    // Prints "This is subclass! The color is :null"
  }
}

//Corrected Code
//Rule 06: User example


//MET05-J
class SuperClass {
  public SuperClass() {
    doLogic();
  }
 
  public final void doLogic() {
    System.out.println("This is superclass!");
  }
}


