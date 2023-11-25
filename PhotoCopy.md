# BinaPhoto-Photoshoot-Booking-Management-Java-

//Subclass
public class photoCopy extends photoShoot{
  
  //Data Member
  private String type;
  private String size;
  private int quantity;
  
  //Default Constructor
  public photoCopy(){
    super();
    type = "";
    size = "";
    quantity = 0;
  }
   
    //Normal Constructor
    public photoCopy (int tps, String ty, String sz, int qt){
      super(tps);
      type = ty;
      size = sz;
      quantity = qt;
    }
    
    //Setter/Mutator
    public void setType (String ty){
      type = ty;
    }
    public void setSize (String sz){
      size = sz;
    }
    public void setQuantity (int qt){
      quantity = qt;
    }
    
    //Getter/Retriever/Accessor
    public String getType(){
      return type;
    }
    public String getSize(){
    	return size;
    }
    public int getQuantity(){
    	return quantity;
    }
    
    //abstract method
    public double calculatePrice(){
    double price = 0;
      
      
     if(getTypeOfPhotoShoot() == 1){
     	price = 10.0;
     		
      if(type.equalsIgnoreCase("Hardcopy")){
         price += 12.0;
         
       if (size.equalsIgnoreCase("4R")) {
         price += 1.80;
       } 
       else if (size.equalsIgnoreCase("6R")) {
         price += 1.00;
       }
       else if (size.equalsIgnoreCase("8R")) {
         price += 3.50;
       }
       else if (size.equalsIgnoreCase("A4")) {
         price += 5.50;
       }
       else if (size.equalsIgnoreCase("A3")) {
         price += 9.90;
       }
      }
      else{
      	price += 8.00;
      }
     }
      
     else if(getTypeOfPhotoShoot() == 2){
        price = 4.00;
        
      if(type.equalsIgnoreCase("Hardcopy")){
         price += 12.00;
         
       if (size.equalsIgnoreCase("4R")) {
         price += 1.80;
       } 
       else if (size.equalsIgnoreCase("6R")) {
         price += 1.00;
       }
       else if (size.equalsIgnoreCase("8R")) {
         price += 3.50;
       }
       else if (size.equalsIgnoreCase("A4")) {
         price += 5.50;
       }
       else if (size.equalsIgnoreCase("A3")) {
         price += 9.90;
       }
      }
      else{
     	price += 8.00;
      } 
     }
      price = price * quantity;
      return price;
    }
    
    //Printer
    public String toString(){
      return super.toString() +"\nType: "+type+ "\nSize: "+size+ "\nQuantity: "+quantity;
    }
    
}
