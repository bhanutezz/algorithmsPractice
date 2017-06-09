package algo;
//
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Combinations {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    private static Set<String> set;
    private int rr=11;
    public Combinations( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }
    
    
    public static void main (String args[])
    {
        Combinations combobj= new Combinations("wxyxz");
        set = new TreeSet<>();
        System.out.println("");
        System.out.println("");
        System.out.println("All possible combinations are :  ");
        System.out.println("");
        System.out.println("");
        combobj.combine(0);
        combobj.print();
        
    }
    private void print(){
    	Iterator<String> iterator = set.iterator();
    	// Displaying the Tree set data
    	while (iterator.hasNext()) {
    		System.out.println(iterator.next() + " ");
    	}
    }
    
    private void combine(int start ){
        for( int i = start; i < inputstring.length(); ++i ){
        	set.add(output.append(inputstring.charAt(i)).toString());
            //System.out.println( output );
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
}