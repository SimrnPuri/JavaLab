public class Yahtzee{

  public void getYahtzee() {
    int counter = 0;
    boolean yat = false;

    Die D1 = new Die();
    Die D2 = new Die();
    Die D3 = new Die();
    Die D4 = new Die();
    Die D5 = new Die();

    do{
      D1.roll();
      D2.roll();
      D3.roll();
      D4.roll();
      D5.roll();

      counter ++;

      if(D1.getSideUp() != D2.getSideUp()){
        yat = false;
      }
      else if(D2.getSideUp() != D3.getSideUp()){
        yat = false;
      }
      else if(D3.getSideUp() != D4.getSideUp()){
        yat = false;
      }
      else if(D4.getSideUp() != D5.getSideUp()){
        yat = false;
      }
      else{
        yat = true;
      }
    }while(!yat);

    System.out.println("You got yahtzee after " + counter + " attempts. ");
  }
}
