import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
  
    double target = 12.345;
    System.out.println ("Enter a number");
    double input = scan.nextDouble ();

    if (input == target)
    {
      System.out.println ("YES!");
    }
    else
    {
      System.out.println("NO"); 
    }

    int targetNum = 48;
    System.out.println ("Enter a number: ");
    int input2 = scan.nextInt ();

    if (input2 == targetNUM)

    
    scan.close();
  }
}
