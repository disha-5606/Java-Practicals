class ShareMarket {
    private int availableShares=100;
    
   synchronized void buyShare(String buyer, int quantity){
      System.out.println(buyer + " wants to buy " + quantity + " shares");
        if(quantity<=availableShares){
            System.out.println("Order processing for "+buyer);

            availableShares = availableShares - quantity;
            System.out.println(buyer +" purchased "+quantity+" shares");
            System.out.println("Available shares "+ availableShares);

        }
        else{
            System.out.println("Order processing failed for "+buyer);
        }
    }
    
}
class Buyer extends Thread {
    private ShareMarket shareMarket;
    private int quantity;

    //constructor
    public Buyer(ShareMarket market, String name, int quantity) {
        super(name);
        this.shareMarket = market;
        this.quantity = quantity;
    }
    @Override 
    public void run() {
        shareMarket.buyShare(getName(), quantity);
    }
}
public class ShareMarketDemo {
    public static void main(String[] args) {
        ShareMarket market = new ShareMarket();
        Buyer buyer1 = new Buyer(market, "Buyer 1", 150);
       Buyer buyer2 = new Buyer(market, "Buyer 2", 10);
        buyer1.start();
      buyer2.start();
    }
}
//Synchronization ensures that only one thread at a time can access the critical section of the method, 
// preventing race conditions and maintaining the correct number of available shares.

// Why synchronization is needed

// Suppose there are only 100 shares.

// Two buyers simultaneously try to buy:

// Buyer 1 → 80 shares
// Buyer 2 → 50 shares

// Without synchronization, both threads might read:

// availableShares = 100

// before either updates it.

// They could both think their orders are valid, causing an incorrect result.

// This is called a race condition.