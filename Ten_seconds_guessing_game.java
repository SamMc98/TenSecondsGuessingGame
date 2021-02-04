package Java_Challenges;

import java.util.Scanner;

public class Ten_seconds_guessing_game {

	static void Menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Type 'stop' when 10 seconds have elapsed. \n\nReady?");
		
		String Answer = input.next();
	      if (Answer.equals("No") || Answer.equals("no")) {
	    	  System.out.println("Never mind then...");
	    	  Menu();
	      }
	      else if (Answer.equals("Yes") || Answer.equals("yes")) {		
	    	  System.out.println("Let's begin!");
	}	      
	}
	
	public static void main(String[] args) throws InterruptedException {
		Menu();
		 // finding the time before the operation is executed
	      long start = System.currentTimeMillis();
	      for (int i = 0; i <5; i++) {
	         Thread.sleep(60);
	      }
	      
	      Scanner input = new Scanner(System.in);
	      String UserInput = input.next();
	      if (UserInput.equals("stop")) {
	      // finding the time after the operation is executed
	      long end = System.currentTimeMillis();
	      //finding the time difference and converting it into seconds
	      float sec = (end - start) / 1000F; 
	      System.out.println((int)sec + " seconds");
	      if ((int)sec == 10) {
	    	  System.out.println("Hooray");
	      }
	      else {
	    	  int difference = Math.abs(10 - (int)sec); //turns float into int
	    	  System.out.println("Bad luck, you didn't quite reach the 10 second mark.");
	    	  System.out.println("You were " + difference + " seconds out");
	      }
		}
		
		input.close();
}
	}