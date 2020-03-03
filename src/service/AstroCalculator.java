package service;
import java.util.Scanner;

// Type your code
public class Example {
	   public static void main (String[] args) { 
	      Scanner sc = new Scanner(System.in);
		   int day = sc.nextInt(); 
	      String month = sc.nextLine() ; 
	      String email = sc.nextLine();
	      String sign=""; 

	      if (month == "January") { 
	         if (day < 20) 
	         sign = "Capricorn"; 
	         else
	         sign = "Aquarius"; 
	      } else if (month == "February"){ 
	         if (day < 19) 
	         sign = "Aquarius"; 
	         else
	         sign = "Pisces"; 
	      } else if(month == "March"){ 
	         if (day < 21)  
	         sign = "Pisces"; 
	         else
	         sign = "Aries"; 
	      } else if (month == "April"){ 
	         if (day < 20) 
	         sign = "Aries"; 
	         else
	         sign = "Taurus"; 
	      } else if (month == "May"){ 
	         if (day < 21) 
	         sign = "Taurus"; 
	         else
	         sign = "Gemini"; 
	      } else if( month == "June"){ 
	         if (day < 21) 
	         sign = "Gemini"; 
	         else
	         sign = "Cancer"; 
	      } else if (month == "July"){ 
	         if (day < 23) 
	         sign = "Cancer"; 
	         else
	         sign = "Leo"; 
	      } else if( month == "August"){ 
	         if (day < 23)  
	         sign = "Leo"; 
	         else
	         sign = "Virgo"; 
	      } else if (month == "September"){ 
	         if (day < 23) 
	         sign = "Virgo"; 
	         else
	         sign = "Libra"; 
	      } else if (month == "October"){ 
	         if (day < 23) 
	         sign = "Libra"; 
	         else
	         sign = "Scorpio"; 
	      } else if (month == "November"){ 
	         if (day < 22) 
	         sign = "scorpio"; 
	         else
	         sign = "Sagittarius"; 
	      } else if (month == "December"){ 
	         if (day < 22) 
	         sign = "Sagittarius"; 
	         else
	         sign ="Capricorn"; 
	      } 
	      System.out.println("The astrological sign for " + day + " " + month + " is " + sign ); 
	   } 
	}