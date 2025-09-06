import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] letters = {
                'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
                '.', ',', '?', '!', ':', '\'', '"', '-', '/', '(', ')', '=', '@', '&'
        };

        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--..", "-----", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.",
                ".-.-.-", "--..--", "..--..", "-.-.--", "---...", ".----.", ".-..-.",
                "-....-", "-..-.", "-.--.", "-.--.-", "-...-", ".--.-.", ".-..."
        };

        System.out.print("Enter an English Text: ");
        String englishIn = scan.nextLine();

        String morseText = Morse.wordToMorse(englishIn, morse, letters);

        System.out.println("Morse: " + morseText);

        System.out.print("Enter a Morse Code: ");
        String morseIn = scan.nextLine();

        String englishText = Morse.morseToWord(morseIn, letters, morse);

        System.out.println("Word: " + englishText);

        scan.close();
    }
}
