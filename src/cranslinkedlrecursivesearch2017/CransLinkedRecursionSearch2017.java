package cranslinkedlrecursivesearch2017;

import javax.swing.JFrame;
/******************************************************
***  CransLinkedRecursionSearch2017
***  Nick Crans
******************************************************
*** Creates frame
***
******************************************************
*** 09/15/2017: Created solution
**  09/18/2017: Wrote code to create frame.
******************************************************/
public class CransLinkedRecursionSearch2017 
{

    /**
     * @param args the command line arguments
     */
    /******************************************************
    ‘***  main
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Creates frame
    ‘*** 
    ‘******************************************************
    ‘*** 09/18/2017: wrote code to create frame.
    ‘******************************************************/
    public static void main(String[] args) 
    {
        GUI start = new GUI();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setSize(550, 350);
        start.setVisible(true); 
    }
    
}
