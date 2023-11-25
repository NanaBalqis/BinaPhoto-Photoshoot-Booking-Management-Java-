# BinaPhoto-Photoshoot-Booking-Management-Java-

//Subclass 
public class photoQuality extends photoShoot{
  
  //Data Member
  private String quality;
  private String photoPaper;
  
  //Default Constructor
  public photoQuality(){
    super();
    quality = "";
    photoPaper = "";
  }
  
  //Normal Constructor
  public photoQuality(int tps, String qy, String pp){
    super(tps);
      quality = qy;
      photoPaper = pp;
  }
  
  //Setter/Mutator
  public void setQuality (String qy){
    quality = qy;
  }
  public void setPhotoPaper (String pp){
    photoPaper = pp;
  }
  
  //Getter/Retriever/Accessor
  public String getQuality(){
    return quality;
  }
  public String getPhotoPaper(){
    return photoPaper;
  }
  
  //Processor
  public double calculatePrice(){
    double price = 0; 
    
  if(photoPaper.equalsIgnoreCase("Glossy")){
   	 price = 3.00;
    if(quality.equalsIgnoreCase("Low")){
       price += 2.60;
    }
    else if(quality.equalsIgnoreCase("Medium")){
       price += 4.60;
    }
    else if(quality.equalsIgnoreCase("High")){
       price += 6.60;
    }
  }	
  else{
     price = 2.00;
    if(quality.equalsIgnoreCase("Low")){
       price += 2.60;
    }
    else if(quality.equalsIgnoreCase("Medium")){
       price += 4.60;
    }
    else if(quality.equalsIgnoreCase("High")){
       price += 6.60;
    }
 }
    return price;
 }
 //processor
   //Printer
   public String toString(){
     return super.toString() +"\nQuality: " +quality+ "\nPhoto Paper: " +photoPaper;
   } 
 } 
