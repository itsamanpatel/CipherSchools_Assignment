import java.io.*;
class Paths { 

	
	static int possiblePaths(int a, int b) 
	{ 
		if (a == 1 || b == 1) 
			return 1; 

		return possiblePaths(a - 1, b) + possiblePaths(a, b - 1); 
		
	} 

	public static void main(String args[]) 
	{ 
		System.out.println(possiblePaths(2, 3)); 
	} 
} 

