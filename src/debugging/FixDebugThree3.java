package debugging;
import java.util.Scanner;
public class FixDebugThree3
//This application gets a user's name and displays a greeting
{
   public static void main(String args[])
   {
      String name;
      name = getName();
      displayGreeting(name);           
   }
   public static String getName()
   {
      String name;
      @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
      System.out.print("Enter name ");
      name = input.nextLine();
      return name;
   }
   public static void displayGreeting(String name)
   {
      System.out.println("Hello, " + name + "!");
   }
}
