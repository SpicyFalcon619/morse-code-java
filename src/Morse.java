public class Morse {
    public static final char[] letters = {
            'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9',
            '.', ',', '?', '!', ':', '\'', '"', '-', '/', '(', ')', '=', '@', '&'
    };

    public static final String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--",
            "--..", "-----", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.",
            ".-.-.-", "--..--", "..--..", "-.-.--", "---...", ".----.", ".-..-.",
            "-....-", "-..-.", "-.--.", "-.--.-", "-...-", ".--.-.", ".-..."
    };

    public static String wordToMorse(String englishText, String[] morse, char[] letters) {

        englishText = englishText.toUpperCase();
        StringBuilder morseCode = new StringBuilder();

        int morseIndex;

        for (int i = 0; i < englishText.length(); i++) {
            char c = englishText.charAt(i);

            if (Character.isAlphabetic(c)) {
                morseIndex = c - 'A';
                morseCode.append(morse[morseIndex]);
                morseCode.append(" ");
            } else if (Character.isDigit(c)) {
                morseIndex = c - '0' + 26;
                morseCode.append(morse[morseIndex]);
                morseCode.append(" ");
            } else if (c == ' ') {
                morseCode.append("/ ");
            } else {
                for (int j = 0; j < letters.length; j++) {
                    if (letters[j] == c) {
                        morseCode.append(morse[j]).append(" ");
                        break;
                    }
                }
            }
        }
        return morseCode.toString();
    }

    public static String morseToWord(String morseCode, char[] letters, String[] morse) {
        StringBuilder englishText = new StringBuilder();

        String[] words = morseCode.trim().split(" ");

        for (String code : words) {
            if (code.equals("/")) {
                englishText.append(" ");
                continue;
            }
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(code)) {
                    englishText.append(Character.toUpperCase(letters[i]));
                    break;
                }
            }
        }

        return englishText.toString();
    }
}