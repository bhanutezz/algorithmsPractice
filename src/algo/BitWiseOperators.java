package algo;

public class BitWiseOperators {

	public static void main(String[] args){
		int a = 2;
		//left shift operator(multiplied by 2^n)
		a = a<<4;
		System.out.println("Output: "+a);
		// right shift operator(divide by 2^n)
		int b = 32;
		b = b>>4;
		System.out.println("Right Output: "+b);
		//zero fill right shift operator
		int c =-32;
		c = c>>>4;
		System.out.println("zero fill output: "+c);
		//and operator
		int d = 2&3;
		System.out.println("output: "+d);
		//or operator
		int e = 2|3;
		System.out.println("output: "+e);
		//bitwise XOR operator ^
		int f = 2^3;
		System.out.println("output: "+f);
		int g = ~2;
		System.out.println("output: "+g);
		
	}
}
