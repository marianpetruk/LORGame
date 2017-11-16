import java.util.Random;

public class CharacterFactory {
    public Character createRandomCharacter() {

        Random random = new Random();
        int character = random.nextInt(4) + 1;

        switch (character) {
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            case 4:
                return new Hobbit();
        }
        System.out.println("Something wrong with the character factory!");
        return null;
    }
}