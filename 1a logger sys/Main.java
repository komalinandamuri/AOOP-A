public class Main {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger = Logger.getInstance();
        
        // Log some messages
        logger.log("Application started.");
        logger.log("Performing some operations...");
        logger.log("Application finished.");
        
        // Demonstrate that only one instance is used
        Logger anotherLogger = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));
    }
}
