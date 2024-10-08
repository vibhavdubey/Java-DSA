package Basic_Java.X_CodingTest;

import java.util.Scanner;

public class CountVowelsConsonantsUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();

        int totalVowels = countVowels(str, 0);
        System.out.println("Total vowels in a string: " + totalVowels);

        int totalConsonants = countConsonants(str, 0);
        System.out.println("Total consonants in a string: " + totalConsonants);
    }

    public static int countVowels(String str, int index) {
        if (index == str.length()) {
            return 0;
        } else {
            char currentChar = str.charAt(index);
            return (isVowel(currentChar) ? 1 : 0) + countVowels(str, index + 1);
        }
    }

    public static int countConsonants(String str, int index) {
        if (index == str.length()) {
            return 0;
        } else {
            char currentChar = str.charAt(index);
            return (isVowel(currentChar) ? 0 : 1) + countConsonants(str, index + 1);
        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

//----------------------------------------------------------------------------------------------------------------------
class VowelConsonantCounter {

//    public static void main(String[] args) {
//        String inputString = "Hello, World!";
//        int[] counts = countVowelsAndConsonants(inputString.toLowerCase()); // Convert to lowercase for case-insensitivity
//
//        System.out.println("Vowels: " + counts[0]);
//        System.out.println("Consonants: " + counts[1]);
//    }
    public static int[] countVowelsAndConsonants(String input) {
        // Initialize counts for vowels and consonants
        int[] counts = new int[2];
        counts[0] = 0; // Vowel count
        counts[1] = 0; // Consonant count

        // Base case: If the input string is empty, return counts
        if (input.isEmpty()) {
            return counts;
        } else {
            char firstChar = input.charAt(0);

            // Check if the first character is a vowel
            if (isVowel(firstChar)) {
                counts[0]++;
            } else if (Character.isLetter(firstChar)) {
                // If it's a consonant (and a letter), increment the consonant count
                counts[1]++;
            }

            // Recursively call the function with the remaining substring
            int[] remainingCounts = countVowelsAndConsonants(input.substring(1));

            // Update counts with the results from the recursive call
            counts[0] += remainingCounts[0];
            counts[1] += remainingCounts[1];

            return counts;
        }
    }

    public static boolean isVowel(char ch) {
        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
