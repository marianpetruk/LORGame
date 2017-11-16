import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    @Test
    public void KnightTest() throws InterruptedException {
        GameManager gm = new GameManager();

        Knight knight1 = new Knight();
        Knight knight2 = new Knight();


        assert (knight1.getHp() >= 2 && knight1.getHp() <= 21);
        assert (knight1.getPower() >= 2 && knight1.getPower() <= 12);
        assert (knight2.getHp() >= 2 && knight2.getHp() <= 21);
        assert (knight2.getPower() >= 2 && knight2.getPower() <= 12);

        assertEquals("Knight", knight1.toString());

        gm.fight(knight1, knight2);
    }

}
