public interface PowerUp {
    @Override
    boolean equals(Object obj);

    void apply();
}

class EasyPowerUp implements PowerUp {
    @Override
    public void apply() {
        System.out.println("Applying EasyPowerUp!");
    }
}

class HardPowerUp implements PowerUp {
    @Override
    public void apply() {
        System.out.println("Applying HardPowerUp!");
    }
}
