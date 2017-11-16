import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ElfTest {
    @Test
    public void ElfTest() throws InterruptedException {
        GameManager gm = new GameManager();

        Elf elf1 = new Elf();
        Elf elf2 = new Elf();
        assert (elf1.getHp() == 10);
        assert (elf1.getPower() == 10);
        assert (elf2.getHp() == 10);
        assert (elf2.getPower() == 10);

        assertEquals("Elf", elf1.toString());

        gm.fight(elf1, elf2);
    }

}
