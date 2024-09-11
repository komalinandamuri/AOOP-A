public abstract class Factory {
    public abstract Weapon createWeapon();
    public abstract PowerUp createPowerUp();

    public static Factory getFactory(String difficulty) {
        switch (difficulty) {
            case "Easy": return new EasyFactory();
            case "Hard": return new HardFactory();
            default: throw new IllegalArgumentException("Unknown difficulty level");
        }
    }
}

class EasyFactory extends Factory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new EasyPowerUp();
    }
}

class HardFactory extends Factory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HardPowerUp();
    }
}
