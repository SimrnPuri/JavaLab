import java.util.Scanner;

class EncryptDecrypt{

public static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    EncryptDecrypt EncrDecr = new EncryptDecrypt();
    String inputString;
    int shiftValue;

    //encryption
    System.out.println("Enter a string to encrypt. ");
    inputString = scan.nextLine();

    System.out.println("What value do you want to encrypt with?");
    shiftValue = scan.nextInt();
    scan.nextLine();

    String encriptedValue = EncrDecr.encrypt(inputString, shiftValue).toString();
    System.out.println(inputString + " encrypted is " + encriptedValue);

    //decryption
    System.out.println("Enter a string to decrypt. ");
    inputString = scan.nextLine();

    System.out.println("What value do you want to decrypt with?");
    shiftValue = scan.nextInt();
    scan.nextLine();

    String decriptedValue = EncrDecr.decrypt(inputString, shiftValue).toString();
    System.out.println(inputString + " decrypted is " + decriptedValue);
  }

  // Encryption method
   public String encrypt(String inputString, int shiftValue) {

        String result = "";
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++)
        {
            int charPosition = CHARACTERS.indexOf(inputString.charAt(i));
            int value = (shiftValue + charPosition) % 26;
            char replace = CHARACTERS.charAt(value);
            result += replace;
        }
       return result;
   }


   // Decryption method
   public  String decrypt(String inputString, int shiftValue) {

     String result = "";
     inputString = inputString.toLowerCase();

     for (int i = 0; i < inputString.length(); i++) {

       int charPosition = CHARACTERS.indexOf(inputString.charAt(i));
       int value = (charPosition - shiftValue) % 26;
       if (value < 0)
       {
           value = CHARACTERS.length() + value;
       }
       char replace = CHARACTERS.charAt(value);
       result += replace;
     }
       return result;
   }

}
