import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.datatransfer.*;

public class Main {
    public static HashMap<Character, String> morseCode = new HashMap<Character, String>();
    public static char base = ' ';
    public static char deca = '\t';
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        morseCode.put('A', ".-");
        morseCode.put('B', "-...");
        morseCode.put('C', "-.-.");
        morseCode.put('D', "-..");
        morseCode.put('E', ".");
        morseCode.put('F', "..-.");
        morseCode.put('G', "--.");
        morseCode.put('H', "....");
        morseCode.put('I', "..");
        morseCode.put('J', ".---");
        morseCode.put('K', "-.-");
        morseCode.put('L', ".-..");
        morseCode.put('M', "--");
        morseCode.put('N', "-.");
        morseCode.put('O', "---");
        morseCode.put('P', ".--.");
        morseCode.put('Q', "--.-");
        morseCode.put('R', ".-.");
        morseCode.put('S', "...");
        morseCode.put('T', "-");
        morseCode.put('U', "..-");
        morseCode.put('V', "...-");
        morseCode.put('W', ".--");
        morseCode.put('X', "-..-");
        morseCode.put('Y', "-.--");
        morseCode.put('Z', "--..");
        morseCode.put('0', "-----");
        morseCode.put('1', ".----");
        morseCode.put('2', "..---");
        morseCode.put('3', "...--");
        morseCode.put('4', "....-");
        morseCode.put('5', ".....");
        morseCode.put('6', "-....");
        morseCode.put('7', "--...");
        morseCode.put('8', "---..");
        morseCode.put('9', "----.");
        morseCode.put(' ', "/");
        // Morse Code
        //English to Morse
        System.out.println("Enter your text.");
        String eToMorse = scanner.nextLine();
        System.out.println(EnglishToMorse(eToMorse));
        //
        System.out.println("Encoding or Decoding?");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input your text.");
        String text = scanner.nextLine();

        switch(choice){
            case 1:
                System.out.println(textEncoding(text));
                break;
            case 2:
                System.out.println(textDecoding(text));
                break;
        }
    }

    public static String textEncoding(String text){
        System.out.println("Encoding...");
        text = text.replace(" ", "/");
        text = text.replace(".", Character.toString(base));
        text = text.replace("-", Character.toString(deca));
        return text;
    }

    public static String textDecoding(String text){
        System.out.println("Decoding...");
        text = text.replace(Character.toString(base), ".");
        text = text.replace(Character.toString(deca), "-");

        return text;
    }

    public static String EnglishToMorse(String text){
        StringBuilder output = new StringBuilder();
        for (char chars:  text.toCharArray()) {
            output.append(morseCode.get(Character.toUpperCase(chars)));
            output.append(" ");
        }

        return output.toString();
    }
}

