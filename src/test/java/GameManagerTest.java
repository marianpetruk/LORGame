import org.junit.Test;

public class GameManagerTest {
    @Test
    public void fightTest() throws Exception {

        CharacterFactory cf = new CharacterFactory();
        GameManager gm = new GameManager();

        Character char1 = cf.createRandomCharacter();
        Character char2 = cf.createRandomCharacter();

        gm.fight(char1, char2);
    }
}
