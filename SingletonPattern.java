
/**
 * What is the singleton pattern? Write a class that uses the singleton pattern. If possible, make
 * sure this implementation is thread safe.
 * John Woltz
 * 10/6/15
 */
public class SingletonPattern
{
    private static  SingletonPattern singleton;
   
    private SingletonPattern(){}
      
    public static synchronized SingletonPattern getInstance(){
        return singleton;
    }  
    
    public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

