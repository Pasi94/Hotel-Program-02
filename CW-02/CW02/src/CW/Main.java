package CW;
import java.io.IOException;
import java.util.Scanner;

public class Main {		
	 public static void main(String args[]) throws IOException{
		 MainMenu mm = new MainMenu();
			HotelProgram hp = new HotelProgram();//creating new HotelProgram object
			Scanner input = new Scanner(System.in);
	        mm.mainMenu();
	        
	        Room [] hotel = new Room [10];//creating a array
	        Queue qu = new Queue();//creating new Queue object
	        hp.initialise(hotel);	        
	        
	        while(true){
	            String userInput = input.next();
	                if(userInput.equalsIgnoreCase("A")){
	                    hp.addCustomer(hotel);
	                }else if(userInput.equalsIgnoreCase("V")){
	                    hp.viewRoom(hotel);
	                }else if(userInput.equalsIgnoreCase("D")){
	                    hp.deleteCustomer(hotel);
	                }else if(userInput.equalsIgnoreCase("S")){
	                    hp.storeData(hotel);
	                }else if(userInput.equalsIgnoreCase("L")){
	                	hotel=hp.load();
	                }else if(userInput.equalsIgnoreCase("3")){
	                    hp.Queue(hotel);
	                }else if(userInput.equalsIgnoreCase("C")){
	                    hp.close();
	            }      
	        }          
	    }          

}
