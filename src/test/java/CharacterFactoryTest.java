import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CharacterFactoryTest {
    @Test
    public void CharacterFactoryTest() {
        CharacterFactory cf = new CharacterFactory();
        Character chr = cf.createRandomCharacter();
        assert (chr instanceof Character);
    }

}
