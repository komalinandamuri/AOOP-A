// Logger.java
public class Logger {

    // Private static variable that holds the single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation from other classes
    private Logger() {
        // You can initialize resources like opening a file or connecting to a remote logging server
    }

    // Public static method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        // For demonstration, we'll just print the message to the console
        // In a real application, you might write this message to a file or a logging service
        System.out.println("LOG: " + message);
    }
}
