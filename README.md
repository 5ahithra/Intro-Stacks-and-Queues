Lab created for CS3 class. Purpose of Stack Lab: 
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
Purpose of Queue Lab: 
//
//    		Write a program that implements a Queue data structure.
//          Given an initial myQueue, create two new queues, 
//          oddQueue and evenQueue, so that oddQueue contains the odd
//          elements of myQueue and evenQueue contains the even elements.
//
//  e.g.
//      as in dealing a deck of cards
//
//  e.g.
//      myQueue   -->   43 92 41 39 10 32 62 17 29 51 35 44 24 15 73 66
//
//      oddQueue  -->   43 41 39 17 29 51 35 15 73
//      evenQueue -->   92 10 32 62 44 24 66
//      
//
///////////////////////////////////////////////////////////////////////////

Both Labs completed on October 26th, 2023
