public class Hobbit extends Character {
    private static final int hp = 3;
    private static final int power = 0;

    public Hobbit() {
        super(hp, power);
    }


    @Override
    public void kick(Character c) {
        toCry();
    }

    public void toCry() {
        System.out.println("I can't kick...\uD83D\uDE22");
    }
}