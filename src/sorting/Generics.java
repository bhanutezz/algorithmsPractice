package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Generics {
	
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		String string1 = "a string";
		String string2 = " declared";
		set.add(string1);
		set.add(string2);
		Iterator<String> iterator = set.iterator();
		int count =0;

		while(iterator.hasNext()){
			count+=1;
		  String aString = iterator.next();
		  System.out.println("Element "+count);
		  if(aString.equalsIgnoreCase("A STRING"))
		  System.out.println(aString + count);
		}
		
		Map<Integer, String> map = new HashMap<>();
		Integer key1   = 121;
		String  value1 = "value 1";
		Integer key2 = new Integer(123);
		String value2 = new String("value 2");
		map.put(key1, value1);
		map.put(key2, value2);
		Iterator<Integer> keyIterator   = map.keySet().iterator();
		System.out.println(map.size());

		while(keyIterator.hasNext()){
		  Integer aKey   = keyIterator.next();
		  String  aValue = map.get(aKey);
		  System.out.println("Key Iterator "+aValue);
		}
		Iterator<String>  valueIterator = map.values().iterator();

		while(valueIterator.hasNext()){
		  String aString = valueIterator.next();
		  System.out.println("Value Iterator " +aString);
		}
		 List<String> al2=new LinkedList<>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");
		  String[] listString = new String[list.size()];
		  listString =(String[])list.toArray(listString);
		  System.out.println(listString);
		  ArrayList<String> list2 = new ArrayList<>(Arrays.asList(listString));
		  System.out.println(list);
		  System.out.println(list2);
		  if(list.equals(list2)){
			  System.out.println("Equal");
		  }
		  TreeSet<String> tree = (TreeSet<String>)list.clone();
		  
	}
	
}
