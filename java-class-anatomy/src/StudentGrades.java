import java.util.Scanner;

public class StudentGrades {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the student's grade: ");
    double grade = scanner.nextDouble();

    scanner.close();

    String status = getStatus(grade);

    System.out.println("Student status: " + status);

  }

  public static String getStatus(double grade) {
    if (grade >= 7) {
      return "Approved";
    } else if (grade >= 5) {
      return "In exam";
    } else {
      return "Failed";
    }
  }

}