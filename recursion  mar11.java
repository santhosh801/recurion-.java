// vRecursion is defined as a process which calls itself directly or indirectly and the corresponding function is called a recursive function.

// types of Recursion:
// Direct recursion: When a function is called within itself directly it is called direct recursion. This can be further categorised into four types: 
// Tail recursion,  
// Head recursion,  
// Tree recursion and 
// Nested recursion.
// Indirect recursion: Indirect recursion occurs when a function calls another function that eventually calls the original function and it forms a cycle.




// Searching and sorting algorithms: Recursive algorithms are used to search and sort data structures like trees and graphs.
// Mathematical calculations: Recursive algorithms are used to solve problems such as factorial, Fibonacci sequence






class GFG 

{ 

	// Returns sum of first 
	// n natural numbers 
	public static int recurSum(int n) 
	{ 
		if (n <= 1) 
			return n; 
		return n + recurSum(n - 1); 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		int n = 7; 
		System.out.println(recurSum(n)); 
	} 
} 

// This code is contributed by Sachin Bisht 
////////////////////////////////////////////////////////////////////////////////////////////
class ff {
    // Prints numbers from 1 to n
    static void printNos(int n)
    {
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n  + " ");
        }
        return;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 14;
        printNos(n);
    }
}

///////////////////////////////////////////////////////////////
// Recursive java program to 
// find sum of digits of a number
import java.io.*;

class sum_of_digits
{
	// Function to check sum 
	// of digit using recursion
	static int sum_of_digit(int n)
	{ 
		if (n == 0)
			return 0;
		return (n % 10 + sum_of_digit(n / 10));
	}

	// Driven Program to check above
	public static void main(String args[])
	{
		int num = 12345;
		int result = sum_of_digit(num);
		System.out.println("Sum of digits in " + 
						num + " is " + result);
	}
}

// This code is contributed by Anshika Goyal.


//////////////////////////////////////////////////////////////////
// java program to calculate length of 
// a string using recursion
import java.util.*;

public class GFG{

	/* Function to calculate length */
	private static int recLen(String str) 
	{

		// if we reach at the end of the string
		if (str.equals(""))
			return 0;
		else
			return recLen(str.substring(1)) + 1;
	}

	/* Driver program to test above function */
	public static void main(String[] args) 
	{

		
		String str ="GeeksforGeeks";
		System.out.println(recLen(str));
	}
}

// This code is contributed by Sam007.
////////////////////////////////////////////////////////////////////////////
// Java Program to Reverse a Sentence Using Recursion
import java.io.*;

public class GFG {
	public static String reverse_sentence(String str)
	{
		// check if str is empty
		if (str.isEmpty())
			// return the string
			return str;
		else {
		
			// extract the character at 0th index, that is
			// the character at beginning
			char ch = str.charAt(0);
		
			// append character extracted at the end
			// and pass the remaining string to the function
			return reverse_sentence(str.substring(1)) + ch;
		}
	}

	public static void main(String[] args)
	{
		// specify the string to reverse
		String str = "Geeksforgeeks";
	
		// call the method to reverse sentence
		String rev_str = reverse_sentence(str);
	
		// print the reversed sentence
		System.out.println(
			"Sentence in reversed form is : " + rev_str);

		// creating another string with numbers
		// and special characters
		String str2 = "Alice";
	
		String rev_str2 = reverse_sentence(str2);
	
		// print the reversed sentence
		System.out.println(
			"Sentence in reversed form is : " + rev_str2);
	}
}

  ///////////////////////////////////////////////////////////////
  // Java program for the above approach
import java.util.*;
public class GFG
{
// Function to print the fibonacci
// series in reverse order.
static void fibo(int n, int a, int b)
{
	if (n > 0) {

		// Function call
		fibo(n - 1, b, a + b);

		// Print the result
		System.out.print(a + " ");
	}
}

// Driver Code
public static void main(String args[])
{
	int N = 10;
	fibo(N, 0, 1);
}
}
// This code is contributed by Samim Hossain Mondal.
