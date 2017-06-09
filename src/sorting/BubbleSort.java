package sorting;

public class BubbleSort {
	int[] theArray = {17, 10, 11, 13, 12, 19, 199, 16, 9};
	
	public int[] bubbleSort(){
		int n = theArray.length;
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=1; j<n; j++){
				if(theArray[j-1]>theArray[j]){
					swap(j-1, j);
					 /*temp = theArray[j-1];
					 theArray[j-1] = theArray[j];
					 theArray[j] = temp;*/
             }
				}
			}
		return theArray;	
		}
		
	
	public void swap(int indexOne, int indexTwo){
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
	public static void main(String[] args){
		BubbleSort bSort = new BubbleSort();
		
		int[] sortedArray = bSort.bubbleSort();
		for(int i=0;i<bSort.theArray.length;i++){
			/*System.out.print(bSort.theArray[i]);
			System.out.println("\n");*/
			System.out.print(sortedArray[i]+" ");
		}
	}
}
