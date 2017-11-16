import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HobbitTest {
    @Test
    public void HobbitTest() throws InterruptedException {
        GameManager gm = new GameManager();
        Hobbit hb1 = new Hobbit();
        Hobbit hb2 = new Hobbit();

        assertEquals(3, hb1.getHp());
        assertEquals(0, hb1.getPower());
        assertEquals(3, hb2.getHp());
        assertEquals(0, hb2.getPower());

        gm.fight(hb1, hb2);
    }


}
