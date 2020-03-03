package service;
import java.util.Scanner;

// Type your code
public class AstroCalculator {
	   public static void main (String[] args) { 
	      Scanner sc = new Scanner(System.in);
		   int day = sc.nextInt(); 
	      String month = sc.nextLine() ; 
	      String email = sc.nextLine();
	      String astrosign=""; 

	      if (month == "January") { 
	         if (day < 20) 
	         astrosign = "Capricorn"; 
	         else
	         astrosign = "Aquarius"; 
	      } else if (month == "February"){ 
	         if (day < 19) 
	         astrosign = "Aquarius"; 
	         else
	         astrosign = "Pisces"; 
	      } else if(month == "March"){ 
	         if (day < 21)  
	         astrosign = "Pisces"; 
	         else
	         astrosign = "Aries"; 
	      } else if (month == "April"){ 
	         if (day < 20) 
	         astrosign = "Aries"; 
	         else
	         astrosign = "Taurus"; 
	      } else if (month == "May"){ 
	         if (day < 21) 
	         astrosign = "Taurus"; 
	         else
	         astrosign = "Gemini"; 
	      } else if( month == "June"){ 
	         if (day < 21) 
	         astrosign = "Gemini"; 
	         else
	         astrosign = "Cancer"; 
	      } else if (month == "July"){ 
	         if (day < 23) 
	         astrosign = "Cancer"; 
	         else
	         astrosign = "Leo"; 
	      } else if( month == "August"){ 
	         if (day < 23)  
	         astrosign = "Leo"; 
	         else
	         astrosign = "Virgo"; 
	      } else if (month == "September"){ 
	         if (day < 23) 
	         astrosign = "Virgo"; 
	         else
	         astrosign = "Libra"; 
	      } else if (month == "October"){ 
	         if (day < 23) 
	         astrosign = "Libra"; 
	         else
	         astrosign = "Scorpio"; 
	      } else if (month == "November"){ 
	         if (day < 22) 
	         astrosign = "scorpio"; 
	         else
	         astrosign = "Sagittarius"; 
	      } else if (month == "December"){ 
	         if (day < 22) 
	         astrosign = "Sagittarius"; 
	         else
	         astrosign ="Capricorn"; 
	      } 
	      System.out.println("The astrological astrosign for " + day + " " + month + " is " + astrosign ); 
	   } 
	}