
import java.util.Scanner;
public class lab1{

public void getMyGrade(String percentage){
  //This method will take percentage as input and print the Grade.
  try{
    double perc = Double.parseDouble(percentage);
  if(perc < 0 || perc > 100){
    System.out.println("Hey There! There is some mistake. The percentage should range between 1 to 100");
  }
  System.out.println("You entered " + perc);

  if(perc >= 80 && perc <= 100){
    System.out.println("Congratulations! Your grade is A.");
  }
  else if(perc >= 70 && perc < 80){
    double delta = 80-perc;
    System.out.println("Good Job! Your grade is B. You needed atleast " + delta +"% more to get the next grade.");
  }
  else if(perc >= 60 && perc < 70){
    double delta = 70-perc;
    System.out.println("Your grade is C. You needed atleast " + delta +"% more to get the next grade.");
  }
  else if(perc >= 50 && perc < 60){
    double delta = 60-perc;
    System.out.println("Your grade is D. You needed atleast " + delta +"% more to get the next grade.");
  }
  else if(perc < 50){
    double delta = 50-perc;
    System.out.println("Your grade is F. You needed atleast " + delta +"% more to pass. Contact student support if you need a tutor to help");
  }
    } catch(NumberFormatException e){
      //catching exception in case the percentage is not a number.
      System.out.println( "Make sure you enter valid percentage.");
    }
}
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to cambrian College. Please Enter your name: ");
        String studentName = scan.nextLine();
        System.out.println("Thank You for the details " + studentName + ". Please Enter your percentage: ");
        String percentage = scan.nextLine();
        lab1 l = new lab1();
        l.getMyGrade(percentage);
  }
}
