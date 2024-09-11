public interface Weapon {
    void use();
}

class EasyWeapon implements Weapon {
    @Override
    public void use() {
        System.out.println("Using EasyWeapon!");
    }
}

class HardWeapon implements Weapon {
    @Override
    public void use() {
        System.out.println("Using HardWeapon!");
    }
}