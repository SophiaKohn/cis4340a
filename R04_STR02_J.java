//Rule 04: User example
//STR02-J

//Defective Code:

public class Example {
  public static void main(String[] args) {
    System.out.println("Title".toUpperCase());
  }
}

//Corrected Code:
public static void processTag(String tag) {
  if (tag.toUpperCase(Locale.ENGLISH).equals("SCRIPT")) {
    return;
  }
  // Process tag
}
