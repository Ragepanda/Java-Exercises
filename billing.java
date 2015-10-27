*/ Write a program to calculate the bill amount, in cents, for the units of power consumed. Following are the rates applicable:

First 0-100 units: 60 cents per unit
Next 200 units: 70 cents per unit
Beyond 300 units: 80 cents per unit
The program should accept three different usage unit readings.

Example

If the following inputs are supplied:

305
180
120

Then, the output should be:

20400
11600
7400

Note: You should assume that input to the program is from console input (raw_input) */

public class billing{
public static void main(String args[]){
    
    int reading;
    int bill;
    
    Scanner scan = new Scanner(System.in);         // Using Scanner to scan successive ints
    
    while(scan.hasNextInt()){                     // Program ends when no more ints are detected by scanner
        reading = scan.nextInt();
        
        if(reading<100)               // Less than 100
            bill = reading*60;
            
        else if (reading >=100 && reading < 300)     // Under 300, greater or equal to 100
            bill = (100*60)+(reading-100)*70;
            
        else if (reading >= 300)                    // Greater or equal to 300
            bill = (100*60) + (200*70) + (reading-300)*80
            
        System.out.println(bill);
    }
}
}