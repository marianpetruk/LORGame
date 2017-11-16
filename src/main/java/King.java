import java.util.Random;

class King extends Character {
    private static final int minHp = 5;
    private static final int maxHp = 15;
    private static final int minPower = 5;
    private static final int maxPower = 15;

    public King() {
        super(new Random().nextInt(maxHp - minHp + 1) + minHp, new Random().nextInt(maxPower - minPower + 1) + minPower);
    }

    public King(int minHp, int maxHp, int minPower, int maxPower) {
        super(new Random().nextInt(maxHp - minHp + 1) + minHp, new Random().nextInt(maxPower - minPower + 1) + minPower);
    }

    @Override
    public void kick(Character c) {
        Character otherChar = c;
        int strength = new Random().nextInt(this.getPower()) + minPower;
        otherChar.setHp(otherChar.getHp() - strength);
        System.out.println(this.getClass().getName() + " just has kicked " + c + "!");
    }
}