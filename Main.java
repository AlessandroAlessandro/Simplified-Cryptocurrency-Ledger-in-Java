import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileNotFoundException;

public class Main{

    public static void main(String[] args){

	int SIZE=20;
	boolean exit = false;
	Transaction[] transArr = new Transaction[SIZE];

	do{
	Menu.displayMenu();
	char choice = Menu.getSelection(); // TO DO: CHECK LOWERCASE
	
	switch (choice) {
	case ('f'):{


	    String logicalLine= null;
	    try{
		Scanner scan = new Scanner(new File("test.txt"));
		scan.useDelimiter(Pattern.compile(";"));
		int c = 0;
		while (scan.hasNext()) {
		    String line = scan.nextLine();
		    line = line.replaceAll("\\s+","");
		    String[] transSplit = line.split(";");
		    transArr[c] = new Transaction(); // iterate and create new transaction object arr
		    transArr[c].transID = transSplit[0]; // place id into transaction object data
		    transArr[c].m = Integer.valueOf(transSplit[1]); // place m into transaction object data
		    String voutPair = transSplit[2]; // place m into transaction object data
		    voutPair = voutPair.replaceAll("\\(","").replaceAll("\\)","");
		    String[] voutSplit = voutPair.split(",",2);
		    
		    checkUtxo(transArr); // ensure utxo work before adding
		    
		    transArr[c].utxo = voutSplit[0];
		    if (voutSplit.length > 1)
		    transArr[c].vout = Integer.valueOf(voutSplit[1]);
		    
		    transArr[c].n = Integer.valueOf(transSplit[3]); // place id into transaction object data
		    transArr[c].outs = transSplit[4]; // place id into transaction object data
		    
		    c++;
		}


       		/*
                // if transaction not right amount of hex digits
                {
                    System.err.println("Transaction ID is in incorrect format");
                }
                */

	    }



	    catch (FileNotFoundException ex) {
	    }




	}
	    break;
	case 't':
	    transaction();
	    break;
	case 'p':{
	    print(transArr);

	}

	    break;
	case 'h':
	    
	break;
	case 'd':
	    
	    break;
	case 'w':
	    transArr = wipe(transArr);
	    break;
	case 'i':
	case 'v':
	case 'b':
	case 'e':{
	    System.out.println("Good-Bye");
	    exit = true;
	    break;
	}
	
	default:
	    throw new IllegalArgumentException("Invalid Selection: " );
	}
	}while (!exit);
    
    }

    /*
      [F]ile:  Supply filename:<infilename>.  Read in a file of transactions. Any invalid transaction shall be identified with an error message to stderr, but not stored. Print an error message to stderr if the input file named cannot be opened. The message shall be “Error: file <infilename> cannot be opened for reading” on a single line, where <infilename> is the name provided as additional command input.  

    public static void file(){
	String logicalLine= null;
	try{	 
	Scanner scan = new Scanner(new File("test.txt"));
	scan.useDelimiter(Pattern.compile(";"));
	int c = 0;
	while (scan.hasNext()) {
	    String line = scan.nextLine();
	    String[] transSplit = line.split(";");
	    transArr[c].transID = transSplit[0];
	    System.out.println("dateSplit[0]:" + transSplit[0]);
	    System.out.println("dateSplit[1]:" + transSplit[1]);

	    c++;
	    }
	    
	    
	    

		
	    /*
		// if transaction not right amount of hex digits
		{
		    System.err.println("Transaction ID is in incorrect format");
		}
				
	
	    logicalLine = scan.next();
	    // rest of your logic
	
	}
	

    
	catch (FileNotFoundException ex) {
	}
	System.out.println(logicalLine);
    }
*/

    /*[T]ransaction: Supply Transaction:<see format below>   Read in a single transaction in the format shown below.  It shall be checked for validity against the ledger, and added if it is valid. If it is not valid, then do not add it to the ledger and print a message to stderr with the transaction number followed by a colon, a space, and the reason it is invalid on a single line.
     */

public static void transaction(){
    
    //    Transaction trans1 = new Transaction("mynumber", 4); // transaction object 
    //trans1.Outputs(1,"alice",9); // outputs object
  

    // System.out.println(trans1.transID);
    //System.out.println(trans1.amount);
    
    
    }


    public static void print(Transaction[] transArr){
	if (transArr == null){
	    System.err.println("Ledger is empty");
	return;
    }
	for (int c=0; c <  20; c++){ // enter max trans size
	    if (transArr[c] == null){
		return;
	    }
	    
	    System.out.println(transArr[c].transID + "; " + transArr[c].m + "; (" +  transArr[c].utxo + ", " + transArr[c].vout + "); "+ transArr[c].n + "; " + "outs "+ transArr[c].outs);
	    
	}

    }

    /*public void help(){

    }public void dump(){

    }
    */
public static Transaction[] wipe(Transaction[] transArr){
    return transArr = null;
    
    }

    /*public void interactive(){

    }public void verbose(){

    }public void balance(){


    }


    */

    public static void checkUtxo(Transaction[] transArr){

	
    }
    
    
    
}



