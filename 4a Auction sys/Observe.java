// Main.java

    public class Observe {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction();

        // Create bidders
        Bidder alice = new Bidder("Alice");
        Bidder bob = new Bidder("Bob");

        // Register bidders to the auction
        auction.addObserver(alice);
        auction.addObserver(bob);

        // Start the auction process
        auction.setItem("Vintage Car");
        auction.startBidding();

        // Unregister a bidder
        auction.removeObserver(bob);

        // End the bidding
        auction.endBidding();
    }
}
