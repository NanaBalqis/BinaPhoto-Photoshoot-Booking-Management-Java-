# BinaPhoto-Photoshoot-Booking-Management-Java-

//Superclass
public abstract class photoShoot{
  //Data members
  private int typeOfPhotoShoot;
  
  //Default Constructor 
  public photoShoot(){
    typeOfPhotoShoot = 0;
  }
  
  //Normal constructor
  public photoShoot(int tps){
    typeOfPhotoShoot = tps;
  }
  
  //Setter or Mutator
  public void setTypeOfPhotoShoot(int tps){
    typeOfPhotoShoot = tps;
  }
  
  //Getter or accessor
  public int getTypeOfPhotoShoot(){
    return typeOfPhotoShoot;
  }
  
  //Processor
  public abstract double calculatePrice();
 
  //Printer
  public String toString(){
    return "\n\nType Of PhotoShoot: " +typeOfPhotoShoot;

  }
}
