import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MorseCodeTranslatorGUI extends JFrame {
    private JTextArea inputArea;
    private JTextArea outputArea;
    private JButton translateToMorseButton;
    private JButton translateToEnglishButton;
    private JButton clearButton;

    public MorseCodeTranslatorGUI() {
        setTitle("Morse Code Translator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputArea = new JTextArea(5, 20);
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        inputArea.setFont(new Font("Monospaced", Font.PLAIN, 16)); // Increased font size
        JScrollPane inputScroll = new JScrollPane(inputArea);
        inputScroll.setBorder(BorderFactory.createTitledBorder("Input"));

        outputArea = new JTextArea(5, 20);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 16)); // Increased font size
        JScrollPane outputScroll = new JScrollPane(outputArea);
        outputScroll.setBorder(BorderFactory.createTitledBorder("Output"));

        translateToMorseButton = new JButton("Translate to Morse");
        translateToEnglishButton = new JButton("Translate to English");
        clearButton = new JButton("Clear");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(translateToMorseButton);
        buttonPanel.add(translateToEnglishButton);
        buttonPanel.add(clearButton);

        add(inputScroll, BorderLayout.NORTH);
        add(outputScroll, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        translateToMorseButton.addActionListener(new TranslateToMorseAction());
        translateToEnglishButton.addActionListener(new TranslateToEnglishAction());
        clearButton.addActionListener(e -> clearFields());

        setVisible(true);
    }

    private void clearFields() {
        inputArea.setText("");
        outputArea.setText("");
    }

    private class TranslateToMorseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputText = inputArea.getText();
            String morseCode = Morse.wordToMorse(inputText, Morse.morse, Morse.letters);
            outputArea.setText(morseCode);
        }
    }

    private class TranslateToEnglishAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String morseText = inputArea.getText();
            String englishText = Morse.morseToWord(morseText, Morse.letters, Morse.morse);
            outputArea.setText(englishText);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MorseCodeTranslatorGUI::new);
    }
}