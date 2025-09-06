# Morse Code Translator (Java)

A simple **Morse Code Translator** built in Java with both **console** and **GUI** versions.  
It converts between English text and Morse code, supporting letters, numbers, and punctuation.

![License](https://img.shields.io/badge/license-MIT-green)

---

## ✨ Features
- Encode **English text → Morse code**
- Decode **Morse code → English text**
- Supports:
  - Letters (A–Z)
  - Numbers (0–9)
  - Punctuation: `. , ? ! : ' " - / ( ) = @ &`
- Two implementations:
  - **Console app** (`Main.java`)
  - **Swing GUI app** (`MorseCodeTranslatorGUI.java`)

---

## 📂 Project Structure
morse-code-java/
│── src/
│ ├── Main.java # Console version
│ ├── Morse.java # Translator logic
│ └── MorseCodeTranslatorGUI.java # GUI version
│
├── README.md
├── .gitignore
└── LICENSE


---

## 🚀 How to Run

### 1. Clone the repo
```bash
git clone https://github.com/SpicyFalcon619/morse-code-java.git
cd morse-code-java/src

2. Compile
```bash
javac Main.java Morse.java MorseCodeTranslatorGUI.java
3. Run
Console version:

java Main
GUI version:

java MorseCodeTranslatorGUI
💡 Example (Console)

Enter an English Text: HELLO WORLD
Morse: .... . .-.. .-.. --- / .-- --- .-. .-.. -..

Enter a Morse Code: .... . .-.. .-.. ---
Word: HELLO
🎨 Example (GUI)
The GUI provides a simple interface:

Enter text in the Input box

Click Translate to Morse or Translate to English

Results appear in the Output box

Use Clear to reset fields


![Morse Code GUI Screenshot](/Morse%20Code.png)
🤝 Contribution
Contributions are welcome! 🚀

Fork this repo

Create a feature branch

Submit a pull request

📜 License
This project is licensed under the MIT License.
