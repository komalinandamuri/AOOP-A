public class GameState {
    private static GameState instance = new GameState();
    private String difficulty;

    // Private constructor prevents instantiation from other classes
    private GameState() {
        difficulty = "Easy"; // Default difficulty
    }

    // Method to get the single instance of GameState
    public static GameState getInstance() {
        return instance;
    }

    // Getter for difficulty
    public String getDifficulty() {
        return difficulty;
    }

    // Setter for difficulty
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
