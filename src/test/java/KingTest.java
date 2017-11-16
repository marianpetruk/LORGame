import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingTest {
    @Test
    public void KingTest() throws Exception {
        GameManager gm = new GameManager();

        King king1 = new King();
        King king2 = new King();
//        System.out.println(king1 + " " + king1.getHp() + " " + king1.getPower());
//        System.out.println(king1 + " " + king1.getHp() + " " + king1.getPower());


        assert (king1.getHp() >= 5 && king1.getHp() <= 15);
        assert (king1.getPower() >= 5 && king1.getPower() <= 15);
        assert (king2.getHp() >= 5 && king2.getHp() <= 15);
        assert (king2.getPower() >= 5 && king2.getPower() <= 15);

        assertEquals("King", king1.toString());

        gm.fight(king1, king2);
    }


}
