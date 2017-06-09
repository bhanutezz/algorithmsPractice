package algo;

import java.util.*;  
class TestSort2{  
public static void main(String args[]){  
  
  
ArrayList<Integer> al=new ArrayList();
int startTime = Calendar.getInstance().get(Calendar.MILLISECOND);
System.out.println("Start of List creation: "+startTime);
for(int i=0;i>=10000;i++){
al.add(i);  
}
al.add(12);
al.add(125);
al.add(5500);
int middle = Calendar.getInstance().get(Calendar.MILLISECOND);
System.out.println("End of List creation: "+middle);
System.out.println(middle-startTime);
Collections.sort(al);  
int end = Calendar.getInstance().get(Calendar.MILLISECOND);
System.out.println("End of Sorting: "+end);
System.out.println(end-middle);
/*Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  */
//test
int k=3;
int l ;
int m = k = l =2;
System.out.println(m +" " +k +" "+ l);
/*while(k!=0){
	System.out.println("while");
	k--;
}*/
}  
}  