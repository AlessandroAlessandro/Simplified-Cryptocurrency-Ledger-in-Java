/*
Alessandro Garcia-Alario
CIS 4930
1/24/18

Menu.class 
Provides menu method that prints menu and provides getSelection  method that returns the selection

 */

import java.util.Scanner;



public class Menu{

    
    /* testing
	public static void main(String[] args)
	{
	    
	    System.out.print("hi");
	    displayMenu();
	    System.out.print(getSelection());
	}
    */	
	// menu method
	public static void displayMenu(){
	    System.out.println("[F]ile\n"+
			       "[T]ransaction\n"+
			       "[P]rint\n"+
			       "[H]elp\n"+
			       "[D]ump\n"+
			       "[W]ipe\n"+
			       "[I]nteractive\n"+
			       "[V]erbose\n"+
			       "[B]alance\n"+
			       "[E]xit\n"+
			       "Select a command: ");
	    
	}
	
public static char getSelection(){
    Scanner input = new Scanner(System.in);
    char selection = input.next().charAt(0);
    return selection;
}



    
    }

    
    
    
