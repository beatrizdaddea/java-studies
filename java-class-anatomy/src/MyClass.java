public class MyClass {
  // method body
  public static void main (String [] args) {

    String firstName = "Beatriz";
    String lastName = "Chieffi";

    String fullName = fullName(firstName, lastName);
    System.out.println(fullName);
  }

  public static String fullName (String firstName, String lastName) {
    return firstName.concat(" ").concat(lastName);
  }
}