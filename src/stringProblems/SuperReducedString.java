package stringProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        System.out.println(reduce(s));
    }
    
    private static String reduce(String s) {
        
        Stack<Character> stack = new Stack<>();
        int h = 0;  //height of stack
        
        for (int i=0; i<s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
                stack.pop();    //throw away
                h--;
            } else {
                stack.push(s.charAt(i));
                h++;
            }
        }
        
        if (h == 0) {
            return "Empty String";
        }
        
        //at the end, stack holds reduced string in reverse order.
        char[] reduced = new char[h];
        for (int i=h-1; i>=0; i--) {
            reduced[i] = stack.pop();
        }
        
        return new String(reduced);
    }
}
