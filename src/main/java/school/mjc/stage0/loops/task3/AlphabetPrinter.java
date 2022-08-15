package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char letter = 97;
        for (int i = 0; i < 26; i++) {
            System.out.println(Character.toString(letter+i));
        }
    }
}
