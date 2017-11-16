import java.net.SocketPermission;

public class Elf extends Character {

    private static final int hp = 10;
    private static final int power = 10;

    public Elf() {
        super(hp, power);
    }

    @Override
    public void kick(Character c) {
        Character elf = this;
        Character otherChar = c;
        if (elf.getPower() >= otherChar.getPower()) {
            otherChar.setHp(0);
            System.out.println("Rampage! " + "Alpha " + elf + " just has killed " + c + "!");
        } else {
            System.out.println(elf + "power = " + elf.getPower());
            otherChar.setPower(otherChar.getPower() - 1);
            System.out.println(elf + " just has kicked " + c + " and the foe lost 1 powerPoint!");
        }
    }
}