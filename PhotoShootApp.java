# BinaPhoto-Photoshoot-Booking-Management-Java-

import java.io.*;
import java.util.*;

public class photoShootApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//photoshoot session
		System.out.print("Enter number of photoshoot session: ");
    	int numSessions = scan.nextInt();
    	photoShoot[] sessions = new photoShoot[numSessions];
    	
    	photoCopy pc[] = new photoCopy[numSessions];
    	photoQuality pq[] = new photoQuality[numSessions];
    	//input
    	for(int i=0; i<numSessions; i++){
    		//option for session photoShoot
      	 	//b & h  . add information about photoshoot(Admin and customer)
      	 	System.out.print("Enter an option for photoshoot session [1-Group or 2-Single]: ");
         	int tps = scan.nextInt();
         	
         	//enter option if admin or customer
         	System.out.print("Enter an option [1-Admin OR 2-Customer]: ");
         	int opt = scan.nextInt();
         	
           //admin
           if(opt == 1){
         		//a. enter customer information(Admin)
           	 	System.out.println("Enter Password : ");
				int pass = scan.nextInt();
           	 	if(pass == 0000){
           	 		System.out.println("Enter information for customer session " + (i + 1));
             		System.out.print("Enter customer name: ");
             		String cn = scan.nextLine();
             		scan.nextLine();
             		System.out.print("Enter customer number phone: ");
             		int cpn = scan.nextInt();
             		System.out.print("Enter booking date dd/mm/yy: ");
             		String dt = scan.nextLine();
             		scan.nextLine();
      
             		sessions[i] = new Customer(tps, cn, cpn, dt);
             		
             		//c. enter information about photo quality(Admin)
             		//d. enter choose information about photo copy(Admin)
             		System.out.print("Enter option for photo copy type [Hardcopy or Softcopy]: ");
             		String ty = scan.nextLine();
             	
             		if(ty.equalsIgnoreCase("Hardcopy")){
             	
             			System.out.print("Enter quality of resolution [Low, Medium, High]: ");
             			String qy = scan.nextLine();
             			System.out.print("Enter type of photo paper [Glossy or Matte]: ");
             			String pp = scan.nextLine();
             	
             			pq[i] = new photoQuality(tps, qy, pp);
             	 
             			System.out.print("Enter size of picture [4R,6R,A4,A3]: ");
             			String sz = scan.nextLine(); 
             			System.out.print("Enter quantity: ");
             			int qt = scan.nextInt();
      
             			pc[i] = new photoCopy(tps, ty, sz, qt);
             			//f. Admin Calculate and display the total purchase price of photoshoot sessions
            			//manipulation
            			double totalPriceAd = 0;
            			double pricePc = 0;
            			double pricePq = 0;
            
            			for(int j=0; j<numSessions; j++){
            				if(pc[j] instanceof photoCopy){
            					photoCopy phc = (photoCopy)pc[j];
            					pricePc = phc.calculatePrice();
            				}
            			}
            			for(int j=0; j<numSessions; j++){
            				if(pq[j] instanceof photoQuality){
            					photoQuality phq = (photoQuality)pq[j];
            					pricePq = phq.calculatePrice();
            				}
            			}
            			totalPriceAd = pricePc + pricePq;
            			System.out.println("Total purchase price of photoshoot sessions: RM" + totalPriceAd); 	
            		}
             		else{
             			System.out.print("Enter quality of resolution [Low, Medium, High]: ");
             			String qy = scan.nextLine();
             		
             			double totalPriceAds = 0;
            			double pricePc = 0;
            			double pricePq = 0;
            
            			for(int j=0; j<numSessions; j++){
            				if(pc[j] instanceof photoCopy){
            					photoCopy phc = (photoCopy)pc[j];
            					pricePc = phc.calculatePrice();
            				}
            			}
            			for(int j=0; j<numSessions; j++){
            				if(pq[j] instanceof photoQuality){
            					photoQuality phq = (photoQuality)pq[j];
            					pricePq = phq.calculatePrice();
            				}
            			}
            			totalPriceAds = pricePc + pricePq;
            			System.out.println("Total purchase price of photoshoot sessions: RM" + totalPriceAds); 	
            		}
             		
             		
             	//e. Determine the photoshoot type with the highest demand
            	System.out.print("HIGHEST DEMAND!!: ");
    
            	int numGroupSessions = 0;
            	int numSingleSessions = 0;
    	
            	if(sessions[i] instanceof photoShoot){
              	 	photoShoot ps = (photoShoot)sessions[i];
               		if (ps.getTypeOfPhotoShoot() == 1) {
                  		numGroupSessions++;
               		} 
               		else{
                  		numSingleSessions++;
               		}
            	}
            	if (numGroupSessions > numSingleSessions) {
            	System.out.println("The photoshoot type with the highest demand is Group.");
            	} 
            	else if (numSingleSessions > numGroupSessions) {
            	System.out.println("The photoshoot type with the highest demand is Single.");
            	}  
           	 	else {
            	System.out.println("The demand for Group and Single photoshoot types are equal.");
            	}

           	   }
           	   else{
           	   	System.out.println("Wrong password, please try again.");
                i--;
           	   }
           }
           else{
           	//g. enter customer information(customer)
           	 System.out.println("Enter information for customer session " + (i + 1));
             System.out.print("Enter customer name: ");
             String cn = scan.nextLine();
             scan.nextLine();
             System.out.print("Enter customer number phone: ");
             int cpn = scan.nextInt();
             System.out.print("Enter booking date dd/mm/yy: ");
             String dt = scan.nextLine();
             scan.nextLine();
      
             sessions[i] = new Customer(tps, cn, cpn, dt);
             
             //i. enter information about photo quality(Customer)
             //j. enter information about photocopy(Customer)
             System.out.print("Enter option for photo copy type [Hardcopy or Softcopy]: ");
             String ty = scan.nextLine();
             
             if(ty.equalsIgnoreCase("Hardcopy")){
             	System.out.print("Enter quality of resolution [Low, Medium, High]: ");
             	String qy = scan.nextLine();
             	System.out.print("Enter type of photo paper [Glossy or Matte]: ");
             	String pp = scan.nextLine();
             	
             	pq[i] = new photoQuality(tps, qy, pp);
             	 
             	System.out.print("Enter size of picture [4R,6R,A4,A3]: ");
             	String sz = scan.nextLine();
             	System.out.print("Enter quantity: ");
             	int qt = scan.nextInt();
      
             	pc[i] = new photoCopy(tps, ty, sz, qt);
             	
             	//k. calculate and display the total purchase price
             	double totalPriceCs = 0;
             	double pricePc = 0;
             	double pricePq = 0;
            
             	for(int j=0; j<numSessions; j++){
            		if(pc[j] instanceof photoCopy){
            			photoCopy phc = (photoCopy)pc[j];
            			pricePc = phc.calculatePrice();
            		}
           	    }
            	for(int j=0; j<numSessions; j++){
           		 	if(pq[j] instanceof photoQuality){
            			photoQuality phq = (photoQuality)pq[j];
            			pricePq = phq.calculatePrice();
            		}
            	}
            	totalPriceCs = pricePc + pricePq;
            	System.out.println("Total purchase price of photoshoot sessions: RM" + totalPriceCs); 
             }
              else{
             	System.out.print("Enter quality of resolution [Low, Medium, High]: ");
             	String qy = scan.nextLine();
             	
             	double totalPriceCss = 0;
            	double pricePc = 8.0;
            	double pricePq = 0;
           
            	for(int j=0; j<numSessions; j++){
            		if(pc[j] instanceof photoCopy){
            			photoCopy phc = (photoCopy)pc[j];
            			pricePc = phc.calculatePrice();
            		}
            	}
            	for(int j=0; j<numSessions; j++){
            		if(pq[j] instanceof photoQuality){
            			photoQuality phq = (photoQuality)pq[j];
            			pricePq = phq.calculatePrice();
            		}
            	}
            	totalPriceCss = pricePc + pricePq;
            	System.out.println("Total purchase price of photoshoot sessions: RM" + totalPriceCss); 	
             }
           }
    	}
	}
}
