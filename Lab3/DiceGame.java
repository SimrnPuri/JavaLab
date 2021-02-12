import java.util.Scanner;
import java.util.*;

public class DiceGame{

  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    int sides = 0;

    System.out.println("We will roll 6 sides die and 20 sides die for you first.");
    System.out.println("Rolling a 6 sides die");
    Die dd6 = new Die();
    dd6.roll();
    System.out.println("We rolled a " + dd6.getDiceType() + " type die for you. It had " + dd6.numSides() + " sides. The roll value is " + dd6.getSideUp());

    System.out.println("Rolling a 20 sides die");
    Die dd20 = new Die(20);
    dd20.roll();
    System.out.println("We rolled a " + dd20.getDiceType() + " type die for you. It had " + dd20.numSides() + " sides. The roll value is " + dd20.getSideUp());

    System.out.println("Enter the number of sides you want your die to have");
    try{
      sides = scan.nextInt();
      scan.nextLine();
      System.out.println("Enter the name you want to give to your die.");
      String name = scan.nextLine();

      Die ddRandom = new Die(sides, name);
      ddRandom.roll();
      System.out.println("We rolled a " + ddRandom.getDiceType() + " type die for you. It had " + ddRandom.numSides() + " sides. The roll value is " + ddRandom.getSideUp());

    }
    catch(InputMismatchException e){
      System.out.println("Please enter valid integer for sides");
    }


    System.out.println("Lets try Yahtzee");

      Yahtzee obj = new Yahtzee();
      obj.getYahtzee();


  }
}
