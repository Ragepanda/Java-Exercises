
/**
 * Write a class that when executed prints out the numbers from 100 to 1 with the following
exceptions:
• If the number is a multiple of 3 print 'foo'.
• If the number if a multiple of 7 print 'bar'.
• If the number is a multiple of both 3 and 7 print 'foobar'.
 * 
 * Jonathan Woltz
 */
public class Question1
{
    public static void main(String[] args)
    {
        for(int x = 100; x >= 1; x--){
            if(x%3 == 0)
                System.out.print("foo");
                
            if(x%7 == 0)
                System.out.print("bar");
                
            if(x%3 != 0 && x%7 != 0)
                System.out.print(x);
                
            System.out.println("");
        }
    }
}
