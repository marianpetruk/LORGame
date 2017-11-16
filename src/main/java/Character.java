public abstract class Character {
    public int hp = 0;
    public int power = 0;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }


    public boolean isAlive() {
        return this.getHp() > 0;
    }

    public abstract void kick(Character c);

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }


    @Override
    public String toString() {
        return this.getClass().getName() + "";
    }

}