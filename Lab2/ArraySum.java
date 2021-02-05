import java.util.Scanner;
import java.lang.*;

class ArraySum{

  public int addNumbers(int[] additionArray){
    int sum =0;

    for(int i = 0; i <  additionArray.length ; i++) {
        sum = sum + additionArray[i];
      }

    return sum;
  }


  public static void main(String args[]){
    int[] additionArray = null;
    int arrayLength =0;

    ArraySum arrSum =  new ArraySum();

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter how many numbers would you like to add?: ");
    String count = scan.nextLine();
    try{
      arrayLength = Integer.parseInt(count);
      additionArray = new int[arrayLength];

      System.out.println("Enter the numbers you would like to add: ");
      for(int i = 0; i <  arrayLength; i++) {
          String numberValue = scan.nextLine();
          additionArray[i] = Integer.parseInt(numberValue);
        }
    }
    catch(NumberFormatException e){
      System.out.println( "Make sure you enter valid number.");
    }
    int sum = arrSum.addNumbers(additionArray);

    System.out.println("The sum of the entered numbers is : " + sum);

  }
}
