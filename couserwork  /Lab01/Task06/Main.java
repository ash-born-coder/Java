/*
 * Name :- Chanuka Ashan Gunawardena
 * Lab Group :- 01
 * Module :- SO2
 * Lab :- 01
 * Task :- WORD COUNTER PROGRAM
 */
package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text;
        String newText;
        String longest;
        int textSize = 0;
        int textNoSpace = 0;
        int sum = 1;
        int vowel = 0;
        int consonants = 0;
        int symbols = 1;


        System.out.print("Enter a sentence or paragraph to analyze: ");
        text = scanner.nextLine();
        textSize = text.length();

        // here we use the method 'replace' to replace the spaces with no spaces to get a all the words attached to each other
        newText = text.replace(" ", "");
        textNoSpace = newText.length();

        // here we count the number of words in the sentence with the help of spaces
        for (int i = 0; i < textSize; i++){

            if (text.charAt(i) == ' '){

                sum++;
            }
        }

        // here we count the number of vowels and as a default we can surmise the number of consonants
        for (int i = 0; i < textSize; i++){

            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                vowel++;
            }
            else{
                consonants++;
            }
        }

        // here we look out for symbols that causes a proper sentences to finish and another to start and add up its occurances
        for (int i = 0; i < textSize; i++){

            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!' || text.charAt(i) == ';' || text.charAt(i) == ':'){
                symbols++;
            }
        }

        // here we look out for the longest word in the from the given sentences
        String[] words = text.trim().split("\\s+"); // here we make the split by one or many spaces
        longest = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println();

        System.out.println(" === TEXT ANALYSIS ===");
        System.out.println(text);

        System.out.println();

        System.out.println("Character Statistics: ");
        System.out.println("- Total characters (with spaces): " + textSize);
        System.out.println("- Total characters (without spaces): " + textNoSpace);
        System.out.println("- Total number of vowels: " + vowel);
        System.out.println("- Total number of consonants: " + consonants);

        System.out.println();

        System.out.println("Word Statistics: ");
        System.out.println("- Total number of words: " + sum);
        System.out.println("- Longest word: " + longest);

        System.out.println();

        System.out.println("Sentence Statistics: ");
        System.out.println("- Total number of sentences: " + symbols);



        System.out.println("- Using the amaying function: " + countVowels(text));


        scanner.close();

        }

        public static int countVowels(String text) {
            int vowel = 0;

            for (int i = 0; i < text.length(); i++){
                char ltr = text.toLowerCase().charAt(i);
                if (ltr == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || ltr == 'o' || text.charAt(i) == 'u'){
                    vowel++;
                }

            }

            return vowel;
        }

    }


