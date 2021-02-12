public class Die{
  private String diceType =  "d6";
  private int numSides = 6;
  private int sideUp;

  public Die(){
    setNumSides(6);
    setDiceType("D6");
  }

  public Die(int sides){
    setNumSides(sides);
    String name = "D"+sides;
    setDiceType(name);
  }

  public Die(int sides, String type){
    setNumSides(sides);
    setDiceType(type);
  }

  public int roll(){
    sideUp = (int) (Math.random() * numSides) + 1;
    setSideUp(sideUp);
    return sideUp;
  }

  public int getSideUp(){
    return sideUp;
  }

  public String getDiceType(){
    return diceType;
  }

  public int numSides(){
    return numSides;
  }

  public void setSideUp(int sideUp){
    this.sideUp = sideUp;
  }

  public void setDiceType(String diceType){
    this.diceType = diceType;
  }

  public void setNumSides(int numSides){
    this.numSides = numSides;
  }

}
