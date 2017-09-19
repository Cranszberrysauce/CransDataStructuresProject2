package cranslinkedlrecursivesearch2017;

import java.util.Random;
/******************************************************
***  LinkedList
***  Nick Crans
******************************************************
*** This class creates the head for the list, adds 500
*** random numbers using recursion, and searches the
*** list using recursive.
******************************************************
*** 09/15/2017: Class created
*** 09/15/2017: Created and finished method to add 
*** random numbers from 1 to 500 to linked list.
*** 09/15/2017: Created and finished method to recursivly
*** search for a number in the list
*** 09/18/2017: Created an finished method toString 
*** methods.
******************************************************/
public class LinkedList 
{
    private Node link;
    private final Random rand;
    private final int SIZE = 500;
    private int count = 0;
    
    /******************************************************
    ‘***  LinkedList()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Constructor. Creates new head to the list.
    ‘*******************************************************
    ‘*** 09/15/2017
    ‘******************************************************/
    public LinkedList()
    {
        link = null;
        rand = new Random();
    }
    
    /******************************************************
    ‘***  add()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Allows outside access to the recursive add method
    ‘*******************************************************
    ‘*** 09/15/2017
    ‘******************************************************/
    public void add()
    {
        recAdd(link);
    }
    
    /******************************************************
    ‘***  recAdd()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Recursivly adds a random number from 1 to 500.
    ‘*******************************************************
    ‘*** 09/15/2017
    ‘******************************************************/
    private void recAdd(Node aLink)
    {
        int aNum = rand.nextInt(500) + 1;
        
        if(aLink != null)
            count++;
        
        if(aLink == null)
        {
            Node firstLink = new Node(aNum, null);
            link = firstLink;
            recAdd(link);
        }
        else
        {
            if(count < SIZE)
            {
                Node newLink = new Node(aNum, aLink);
                newLink.setLink(link);
                link = newLink;
                recAdd(link);
            }
        }
    }
    
    /******************************************************
    ‘***  search()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Calls the recursive method that will set found to
    ‘*** either true or false 
    ‘*******************************************************
    ‘*** 09/15/2017
    ‘******************************************************/
    public boolean search(int value)
    {
        boolean found;
        
        found = recSearch(link, value);
        
        return found;
    }
    
    /******************************************************
    ‘***  recSearch()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** This recursivaly iterates through the list. If the
    ‘*** number searched for is in the list true is returned
    ‘*******************************************************
    ‘*** 09/15/2017
    ‘******************************************************/
    private boolean recSearch(Node aLink, int value)
    {
        boolean found = false;
        
        if(aLink == null)
            return found;
        else if(aLink.getValue() == value)
        {
            found = true;
            return found;
        }

        return recSearch(aLink.getLink(), value);
    }

    /******************************************************
    ‘***  toString()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** This is what is called to call the recursive method
    ‘******************************************************
    ‘*** 09/18/2017
    ‘******************************************************/
    @Override
    public String toString()
    {
        String values = "[";
        values = recToString(values, link);
        
        return values;
    }
    
    /******************************************************
    ‘***  recToString()
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Assigns the values within all the list to a string
    ‘*** so they can be displayed in a gui. 
    ‘******************************************************
    ‘*** 09/18/2017
    ‘******************************************************/
    private String recToString(String values, Node aLink)
    {
        if(aLink == null)
        {
            return values += "]";
        }
        
        if(aLink.getLink() == null)
            values += aLink.getValue();
        else
            values += aLink.getValue() + ", ";

        return recToString(values, aLink.getLink());
    } 
}