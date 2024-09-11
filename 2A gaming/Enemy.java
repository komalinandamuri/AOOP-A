public interface Enemy {
    void attack();
}

class EasyEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("EasyEnemy attacks!");
    }
}

class HardEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("HardEnemy attacks!");
    }
}