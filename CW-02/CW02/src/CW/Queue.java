package CW;

public class Queue  {
	private String[] array; 
	private int arraySize = 0; 
	private int top = 0; 
	private int end = 0; 
	
		public Queue() { 
			array = new String[7]; //creating a array
		} 
		public void enqueue(String value) { 
			if (arraySize == array.length) { 
				System.out.println("Queue is full"); 
				System.out.println("Removing: " + dequeue()); 
			} array[end] = value; 
				end = (end + 1) % array.length; arraySize++; }
		public String dequeue() { 
			if (arraySize == 0) { 
				System.out.println("Queue is already empty"); 
			} 
			String item = array[top]; 
			array[top] = null; top = (top + 1) % array.length; 
			arraySize--;

			return item; 
		} 
}
	
	
	
	