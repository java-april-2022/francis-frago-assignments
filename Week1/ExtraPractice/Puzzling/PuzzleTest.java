import java.util.Random;

public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

        System.out.println("\n----Generate 10 Random Numbers ----");
        System.out.println(appTest.getTenRolls());

        System.out.println("\n----Generate A Random Letter ----");
        System.out.println(appTest.getRandomLetter());

        System.out.println("\n----Generate 8 Character Password ----");
        System.out.println(appTest.generatePassword());

        System.out.println("\n----Generate 4 Password Sets ----");
        System.out.println(appTest.getNewPasswordSet(4));

    }
}
