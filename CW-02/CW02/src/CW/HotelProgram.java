package CW;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class HotelProgram {	
	
	Queue qu = new Queue();//creating new Queue object
    
        static Scanner input = new Scanner(System.in);
        static String roomCusName = "";
        static int roomNum = 0;
        
        //initialise method
        public void initialise(Room hotel[]){
        for(int x=0; x<hotel.length; x++){
        	Room room=new Room("Empty",x);
            hotel[x] = room;
        }
    } 
        //viewroom method
    public void viewRoom(Room[] hotel) {
	for (int x = 0; x < 10; x++) {
            System.out.println("Room " + (x + 1) + " is occupied by " + hotel[x].getRoomCusName());
            }
	}
    	//addCustomer method
    public void addCustomer(Room[] hotel){
        System.out.println("Enter room number (1 - 10) or 11 to stop:");
            roomNum = input.nextInt();
            if (roomNum >= 1 && roomNum <= 10) {
		System.out.print("Enter customer name : ");
            roomCusName = input.next();
            } else {
		System.exit(0);
            }
            Room room=new Room(roomCusName,roomNum);
            hotel[roomNum - 1] = room;            
        qu.enqueue(room.getRoomCusName() +" ");		
        System.out.println("occupied");    	
   }
    	//deleteCustomer method
    public void deleteCustomer(Room [] hotel){
        System.out.println("Enter room number (1 - 10)");
            roomNum = input.nextInt();
            if (roomNum >= 1 && roomNum <= 10) {
		System.out.print("Enter customer name : ");
            roomCusName = input.next();
            } else {
            	System.out.println("Wrong Input");
            	System.out.println("Enter room number 1 - 10");
		System.exit(0);
            }
            Room room=new Room("Empty",roomNum);
            hotel[roomNum - 1] = room;                
                System.out.println("Deleted Done");
        System.out.println();
    }
    	//storeData method
    public void storeData(Room[] hotel){
    	 try{
             ObjectOutputStream output = new ObjectOutputStream
                     (new FileOutputStream("ReservationRecords.txt", false));

             output.writeObject(hotel);
             System.out.println("Save completed");
             output.close();

         }catch (Exception ex){
             System.err.println("Save Failed \n Error: "+ex);
         }
      System.out.println("Done");
    }
    	//load method
    public Room[] load(){
        Room [] hotel = new Room [10];
    	try {
            ObjectInputStream input = new ObjectInputStream
                    (new FileInputStream("ReservationRecords.txt"));

            hotel = (Room[])(input.readObject());
          
            System.out.println("Load completed");
            return hotel;
        }catch (Exception ex){
        	System.err.println("Load Failed \n Error: "+ex);
        }
        return hotel;
    } 
    	//Queue method
    public void Queue(Room[] hotel){ 
    	for (int i = 1; i < 4; i++) { 
    	System.out.println("Customer "+i+" : "+qu.dequeue()); 
    	} 
    } 
    	//close method
    public void close() {
    	System.exit(0);
	}
}
