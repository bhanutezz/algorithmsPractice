package algo;

import java.util.Random;

public class JumbleWords {

	public static void main(String[] args) {
	    String [] original = {"Hello", "How", "Are", "You"};
	    jumble(original);
	}


	private static String[] jumble(String[] arr){
	    Random r = new Random();
	    for(int i = arr.length-1; i > 0; i--){
	        int rand = r.nextInt(i+1);
	        /*System.out.println(rand);*/
	        String temp = arr[i];
	        arr[i] = arr[rand];
	        arr[rand] = temp;
	    }
	    print(arr);
	    return arr;
	}


	private static void print(String[]arr){
	    for(int i = 0; i < arr.length; i++){
	        System.out.println(arr[i]);
	    }
	}
	
}
