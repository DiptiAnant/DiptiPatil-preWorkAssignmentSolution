package practice;

import java.util.Scanner;

public class Main {

Scanner sc = new Scanner(System.in);
           //function to checkPalindrome

       public void checkPalindrome()  {
    	   int r,sum=0,temp;    
    	   int n=454; 
    	   
    	   temp=n;    
    	   while(n>0){    
    	    r=n%10;  
    	    sum=(sum*10)+r;    
    	    n=n/10;    
    	   }    
    	   if(temp==sum)    
    	    System.out.println("palindrome number ");    
    	   else    
    	    System.out.println("not palindrome");    
      }
            //function to printPattern

       public void printPattern() {
    	   int n=5;
    	   for(int i=0; i<n; i++) {
    		   for(int j=0; j<5-i;j++) {
    			   System.out.print("* ");
    		   }
    		   System.out.println();
    	   }

      }
          //function to check no is prime or not

        public void checkPrimeNumber() {
        	int n= 5, count=1;
        	int num=n/2;
        	for(int i=2; i<=num; i++) {
        		if(n%i==0) {
        			count++;
        		}
        	}
        	if(count>2) {
        		System.out.println("Not Prime Number");
        	}
        	else
        		System.out.println("Prime Number");
        }
          // function to print Fibonacci Series

          public void printFibonacciSeries() {
                //initialize the first and second value as 0,1 respectively.
           int first = 0, second = 1, num=7, n, iterate=1;
           System.out.print("0 1 ");
           do {
        	   n=first+second;
        	   System.out.print(n+" ");
        	   first=second;
        	   second=n;
        	   iterate++;
           }while(iterate<=num);
           
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

}