
///////////////////////////////////////////////////////////////////////////
//
//         Write a Java program to determine that a given expression 
//          contains a set of correctly nested brackets of various 
//          kinds ( {,} [,] (,) ). That is, we want to check that:
//            - There are an equal number of right and left parentheses, 
//              curly brackets, and square brackets.
//            - Every right bracket is preceded by a corresponding 
//              left bracket.
//
//          Read a string expression using an input dialog interface.
//
//          For example, your program should print
//              true for [()]{}{[()()]()} and
//              false for [(]).
//
///////////////////////////////////////////////////////////////////////////
//
//          This checker must implement the following algorithm:
//
//          1. Make an empty stack.
//
//          2. Read symbols until the end of the source code file.
//                a.  If the symbol is an opening symbol,
//                      push it onto the stack.
//                b.  If it is a closing symbol, do the following:
//                    i.  If the stack is empty, report an error.
//                    ii. Otherwise, pop the stack.
//                          If the symbol popped is not the
//                          corresponding opening symbol,
//                          report an error.
//
//          3. At the end of the string, if the stack is not empty,
//             report an error.
//
///////////////////////////////////////////////////////////////////////////

/*

SAMPLE DATA
[()]{}{[()()]()} 
[(])
[]
((())

SAMPLE OUTPUT
GOOD
BAD
GOOD
BAD

*/

//Sahithra Kesavan
//Period 4

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
	

    public static void main(String[] args)
    {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter brackets,parantheses, etc to check if nested");
        String kb = scanner.nextLine();
        
        if (isValid(kb))
        {
        	
            System.out.println("GOOD");
        } 
        else
        	
        {
            System.out.println("BAD");
        }
        scanner.close();
    }

    public static boolean isValid(String kb) 
    {
    	
        Stack<Character> stack = new Stack<>();
        for (char bracket : kb.toCharArray()) 
        {
        	
            if (OpenBracket(bracket)) 
            {
            	
                stack.push(bracket);
            } 
            else if (CloseBracket(bracket))
            	
            {
            	
                if (stack.isEmpty() || !Match(stack.pop(), bracket)) 
                {
                	
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean OpenBracket(char bracket) 
    {
    	
        return bracket == '(' || bracket == '{' || bracket == '[';
    }

    public static boolean CloseBracket(char bracket) 
    {
    	
        return bracket == ')' || bracket == '}' || bracket == ']';
    }

    public static boolean Match(char openBracket, char closeBracket) 
    {
        return (openBracket == '(' && closeBracket == ')') || (openBracket == '{' && closeBracket == '}') || (openBracket == '[' && closeBracket == ']');
    }
}

