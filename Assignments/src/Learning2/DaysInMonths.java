package Learning2;

import java.util.Scanner;

public class DaysInMonths {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// to find number of days in a month 
		System.out.println("Enter Number: ");
		int month= scan.nextInt();
		
		if(month==1) {
			System.out.println("January is of 31 days");
		}
		else if(month==2) {
			System.out.println("February is of 28 days");
		}
		else if(month==3) {
			System.out.println("March is of 31 days");
		}
		else if(month==4) {
			System.out.println("April is of 30 days");
		}
		else if(month==5) {
			System.out.println("May is of 31 days");
		}
		else if(month==6) {
			System.out.println("June is of 30 days");
		}
		else if(month==7) {
			System.out.println("July is of 31 days");
		}
		else if(month==8) {
			System.out.println("August is of 31 days");
		}
		else if(month==9) {
			System.out.println("September is of 30 days");
		}
		else if(month==10) {
			System.out.println("October is of 31 days");
		}
		else if(month==11) {
			System.out.println("November is of 30 days");
		}
		else if(month==12) {
			System.out.println("December is of 31 days");
		}
		else {
			System.out.println("Dear Human Calender only have 12 month in a year!!!!!!!!");
		}
	}

}





//package testing;
//public class User {  
//       public static void main(String[] args) {  
//           
//           
//           int month = 31;
//           
//           int res = (month == 1?31:month == 2?29:month == 3?31:month == 4?30:month == 5?31:month == 6?30:month == 7?31:month == 8?31:month == 9?30:month == 10?31:month == 11?30:month == 12?31:0);
//           
//           if(res == 0)
//           {
//               System.out.println("Dear Human Calender only have 12 month in a year!!!!!!!!");
//           }
//           else
//           {
//               System.out.println(res+" Days in selected month");
//           }
// 
//        }   
//}




