public class Transaction{

    String transID; // 32-bit transaction identifier given in hex
    int m; //number of UTXOs that are inputs to this transaction
    String vout;
    int n; // the number of transaction outputs
    String acctID; // account name
    int amount; //natural number of satoshis that is credited to the account named in the pair by this transaction. 
    public Transaction(String transID, int m){// constructor
	this.transID = transID;
	this.m = m;

	

    }
    


    


   public void Outputs (int n, String acctID, int amount){
       this.n = n;
       this.acctID= acctID;
       this.amount = amount;

   }
    
	
}

