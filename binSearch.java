
/**
 * Write a method that utilitizes the Binary Search algorithm to search a sorted array of integers.
 * The return value of the method should be an index of the array tha holds the value being searched
 * for, or -1 if the array does not contain the value. Additionally, have the method print out each
 * index that is being examined
 * 
 * Jonathan Woltz
 * 10/6/15
 */
public class binSearch
{
    private int[] set;
    private int target,first,last,middle;


    public binSearch(int target, int[] set)
    {
        this.target = target;
        this.set = set;
        this.first = 0;
        this.last = set.length;
        this.middle = last/2;
    }

 
    public int sort()
    {
        while(first <= last){
            if(set[middle] == target)
                return middle;
            if(set[middle] < target)
                first = middle+1;
            else if(set[middle] > target)
                last = middle-1;
                
             middle = (first+last)/2;
        } 
        return -1;
    }
}
