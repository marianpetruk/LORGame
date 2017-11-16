class GameManager {
    public void fight(Character c1, Character c2) throws InterruptedException {
        System.out.println(c1 + " vs " + c2);
        System.out.print("Fight");
        System.out.print(" starts ");
        System.out.println("now!");

        if (c1.getPower() == c2.getPower()) {
            System.out.println("These two are friends! They won't fight!");
        } else {

            while (c1.isAlive() && c2.isAlive()) {
                System.out.println(c1 + " kicks!");
                c1.kick(c2);

                if (c2.isAlive()) {
                    System.out.println(c2 + " kicks!");
                    c2.kick(c1);

                    if (!c1.isAlive()) {
//                    System.out.println(c1 + " hp = " + c1.getHp());
                        System.out.println(c1 + " is dead!");
                        break;
                    } else if (!c2.isAlive()) {
//                    System.out.println(c2 + " hp = " + c2.getHp());
                        System.out.println(c2 + " is dead!");
                        break;
                    }
                }
            }
        }

    }
}