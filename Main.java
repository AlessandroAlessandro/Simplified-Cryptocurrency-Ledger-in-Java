import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;

public class Main{

    public static void main(String[] args){

	Menu.displayMenu();
	char choice = Menu.getSelection(); // TO DO: CHECK LOWERCASE
	
	switch (choice) {
	case ('f'):
	    file();

	    break;
	case 't':
	    transaction();
	    break;
	case 'p':
	case 'h':
	    
	break;
	case 'd':
	    
	    break;
	case 'w':
	case 'i':
	case 'v':
	case 'b':
	case 'e':{
	    System.out.println("Good-Bye");
	    break;
	}
	
	default:
	    throw new IllegalArgumentException("Invalid Selection: " );
	}
    }


    /*
      [F]ile:  Supply filename:<infilename>.  Read in a file of transactions. Any invalid transaction shall be identified with an error message to stderr, but not stored. Print an error message to stderr if the input file named cannot be opened. The message shall be “Error: file <infilename> cannot be opened for reading” on a single line, where <infilename> is the name provided as additional command input.  */

    public static void file(){
	String logicalLine= null;
	try{	 
	Scanner scan = new Scanner(new File("test.txt"));
	scan.useDelimiter(Pattern.compile(";"));

	while (scan.hasNext()) {
	     logicalLine = scan.next();
	    // rest of your logic
	}
	}
	catch (FileNotFoundException ex) {
	}
	System.out.println(logicalLine);
    }


    /*[T]ransaction: Supply Transaction:<see format below>   Read in a single transaction in the format shown below.  It shall be checked for validity against the ledger, and added if it is valid. If it is not valid, then do not add it to the ledger and print a message to stderr with the transaction number followed by a colon, a space, and the reason it is invalid on a single line.
     */

public static void transaction(){
    
    Transaction trans1 = new Transaction("mynumber", 4); // transaction object 
    trans1.Outputs(1,"alice",9); // outputs object
  

    System.out.println(trans1.transID);
    System.out.println(trans1.amount);
    
    
    }

    /*
    public void print(){

    }public void help(){

    }public void dump(){

    }public void wipe(){

    }public void interactive(){

    }public void verbose(){

    }public void balance(){


    }
    
    
    */
    
}
