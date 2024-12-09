import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // Create objects and test your classes in here
    //Point2D dot1 = new Point2D();
    //Point2D dot2 = new Point2D();

    Person amonda = new Person();
    String str;
    int x;
    System.out.println("first name NOW");
    str = sc.nextLine();
    amonda.setfname(str);
    System.out.println("last name NOW");
    str = sc.nextLine();
    amonda.setlname(str);
    sc.nextLine();
    System.out.println("age NOW");
    x = sc.nextInt();
    amonda.setage(x);
    System.out.println("SSN NOW");
    x = sc.nextInt();
    amonda.setSSN(x);
    System.out.println(amonda.toString());

    sc.close();
  }
}
