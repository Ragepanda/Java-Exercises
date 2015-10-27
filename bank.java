/* Write a program which accepts bank account transactions in a comma separated sequence and prints the net account balance. The various transactions are classified as deposits (D) and withdrawals (W). Deposit transactions are suffixed with a hyphen followed by D and Withdrawal transactions are suffixed with a hyphen followed by W.

If the net account balance is more than 5000 dollars, an interest of 5% should be added to the balance. The amount to be printed should be an integer value, such that if you are getting an output of 4321.0, the program should give the output as 4321.

Example

If following input is supplied to the program:

2000-D,4000-D,500-W

Then, the output of the program should be:

5775

In this example, since the net balance was above $5000, 5 % interest has been added to it.

Note: You should assume that input to the program is from console input (raw_input) */

public class bank
{
public static void main(string args[])
{
    int deposit;
    int withdrawal;
    int total;
    String input;
    String[] transactions;
    String formatted;
    
    if(scan.hasNextLine){                                  // Using the scanner class to read from command line 
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    transactions = input.split(",");          // Splitting the sequence of data into a transactions array 
    for(int x = 0; x<transactions.length; x++){
        if(transactions[x].contains("-W"){           // Branches separate based on Withdrawal or Deposit
            formatted = transactions[x].substring(0, transactions[x].length()-2);   // Cuts off last 2 chars of string
            withdrawal = withdrawal + Integer.parseInt(formatted);                  // convert to int and add to total
        }
        else if(transactions[x].contains("-D"){
            formatted = transactions[x].substring(0, transactions[x].length()-2);
            deposit = deposit + Integer.parseInt(formatted);  
        }
    }
    total = deposit - withdrawal;
    
    if(total>5000){                 // Adds a 5% interest if above 5k
        total = total + (total/20);
    }
    System.out.println(total);
    
    }
}
}