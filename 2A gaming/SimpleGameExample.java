public class SimpleGameExample {
    public static void main(String[] args) {
        // Set up game state
        GameState gameState = GameState.getInstance();
        gameState.setDifficulty("Easy");  // Change to "Hard" as needed

        // Create enemies
        EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getDifficulty());
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        // Create weapons and power-ups
        Factory factory = Factory.getFactory(gameState.getDifficulty());
        Weapon weapon = factory.createWeapon();
        PowerUp powerUp = factory.createPowerUp();
        weapon.use();
        powerUp.apply();
    }
}
