package by.alex.test;

public class Main {
public static void main(String[] args) {
	System.out.println("Hello from gut hub");
	 String input = "abcd";
	int index = input.indexOf("abc");
	    while (true) {
	        if (index == -1) {
	            break;
	        }
	        String found = input.substring(index+1, index+4);
	        System.out.println(found);
	        index = input.indexOf("abc", index+4);
}
}
}
