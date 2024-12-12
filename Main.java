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

    Oven oven1 = new Oven();
    System.out.println("Maximum oven temp:");
    x = sc.nextInt();
    oven1.setmax(x);
    System.out.println("Starting temp of oven:");
    x = sc.nextInt();
    oven1.setcurr(x);
    str = "";
    sc.nextLine();
    while (!(str.equals("q"))){
      System.out.println("New oven with a max temp of " + oven1.getMaxTemp() + " and a starting temp of " + oven1.getCurrentTemp() + " degrees.");
      System.out.println("To preheat oven, enter \"p\", to turn off oven enter \"o\", to restart enter \"r\", to quit enter \"q\"");
      str = sc.nextLine();
      if (str.equals("p")){
        sc.nextLine();
        System.out.println("enter the temp to preheat oven to:");
        x = sc.nextInt();
        oven1.preheat(x);
        System.out.println("Current temperature of the oven is now " + oven1.getCurrentTemp() + " degrees");

      }
      if (str.equals("o")){
        sc.nextLine();
        oven1.turnOff();
        System.out.println("Turning the oven off.");
      }
      sc.nextLine();
    }

    sc.close();
  }
}
