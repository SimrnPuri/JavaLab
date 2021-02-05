import java.util.Scanner;

 class ArraySearch{

  private int[] arrayGenerator(int length){
    int[] randomArray = new int[length];
    for(int i = 0; i <  randomArray.length; i++) {
        randomArray[i] = (int)(Math.random() * 101);
      }
      return randomArray;
  }

  private boolean numberSearch(int numberToSearch, int arraySize){

    boolean result = false;
    int[] searchArray;
    searchArray = arrayGenerator(arraySize);
    for(int i = 0; i<searchArray.length; i++){
       if(numberToSearch == searchArray[i]){
          result = true;
       }
  }
  return result;
  }

  public static void main(String args[]){
    int numberToSearch = 0;
    int arraySize = 0;
    ArraySearch as = new ArraySearch();
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the luck game. Enter the number you want to search: ");
    String num = scan.nextLine();
    System.out.println("What is your search range. Enter a number: ");
    String count = scan.nextLine();

    try{
       numberToSearch = Integer.parseInt(num);
       arraySize = Integer.parseInt(count);
    }
    catch(NumberFormatException e){
      System.out.println( "Make sure you enter valid number.");
    }

    boolean searchResult = as.numberSearch(numberToSearch,arraySize);
      if(searchResult == true){
        System.out.println("You are lucky. Your number is in the lot");
      }
      else{
        System.out.println("Better luck next time. Your number is not in the lot");
      }

  }

}
