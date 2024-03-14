
///////////////////////////////////////////////////////////////////////////
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

//Sahithra Kesavan
//Period 4

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 
{
    public static void main(String[] args) 
    {
        Queue<Integer> ogQueue = new LinkedList<>();
        ogQueue.add(43);
        ogQueue.add(92);
        ogQueue.add(41);
        ogQueue.add(39);
        ogQueue.add(10);
        ogQueue.add(32);
        ogQueue.add(62);
        ogQueue.add(17);
        ogQueue.add(29);
        ogQueue.add(51);
        ogQueue.add(35);
        ogQueue.add(44);
        ogQueue.add(24);
        ogQueue.add(15);
        ogQueue.add(73);
        ogQueue.add(66);

       
        Queue<Integer> odds = new LinkedList<>();
        Queue<Integer> evens = new LinkedList<>();
        separateOddAndEven(ogQueue, odds, evens);

     
        System.out.println("ogQueue: " + ogQueue);
        System.out.println("oddQueue: " + odds);
        System.out.println("evenQueue: " + evens);
    }

    public static void separateOddAndEven(Queue<Integer> ogQueue, Queue<Integer> odds, Queue<Integer> evens) 
    {
        for (Integer num : ogQueue) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
    }
}

