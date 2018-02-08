
public class Transaction{

    public String transID; // 32-bit transaction identifier given in hex
    public int m; //number of UTXOs that are inputs to this transaction
    public int vout;
    public String utxo; 
    public int n; // the number of transaction outputs
    public String acctID; // account name
    public int amount; //natural number of satoshis that is credited to the account named in the pair by this transaction.
    public String outs;
    public Transaction(){// constructor
	

	
	

    }
    


    


   public void Outputs (int n, String acctID, int amount){
       this.n = n;
       this.acctID= acctID;
       this.amount = amount;

   }
    
	
}

