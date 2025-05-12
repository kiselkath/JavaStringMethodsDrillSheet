/**
 * 🧠 Java String Methods Drill Sheet
 *
 * Problem Background:
 * You are given a list of simple String processing tasks often seen in data validation, filtering, and reporting.
 * These are the kinds of operations you would do when building backend APIs, forms, or search features.
 *
 * Goal:
 * Implement each method using core String methods. Use inline comments to explain your logic.
 */
public class StringDrill {

    /**
     * Returns true if the input string is a palindrome (reads the same forwards and backwards).
     *
     * Theory: Use String reversal and comparison.
     * Use Case: Username or token symmetry validation.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().strip();
        StringBuilder reversed = new StringBuilder(normalized).reverse();
        // Step 1: Normalize case
        // Step 2: Remove all spaces
        // Step 3: Reverse the string and compare to original
        return normalized.equals(reversed.toString()); // Replace with real logic
    }

    /**
     * Replaces all vowels in a string with '*'.
     *
     * Theory: Regular expressions can help pattern match vowels.
     * Use Case: Censoring user content.
     *
     * @param input the original string
     * @return string with vowels replaced
     */
    public String replaceVowels(String input) {
        // Use replaceAll with regex pattern "[aeiouAEIOU]"
        // (?i) — включает регистронезависимый режим (чтобы заменялись и большие, и маленькие буквы).
        return input.replaceAll("(?i)[aeiouаеёиоуыэюя]", "Ъ");
    }

    /**
     * Capitalizes the first letter of each word in the sentence.
     *
     * Theory: Split string by spaces, capitalize each word, and re-join.
     * Use Case: Formatting names or titles.
     *
     * @param sentence input sentence
     * @return transformed sentence
     */
    public String capitalizeWords(String sentence) {
        // Use split and loop through words
        return null;
    }

    /**
     * Counts how many times a specific word appears in the sentence (case-insensitive).
     *
     * Theory: Normalize and use split to count matches.
     * Use Case: Analytics and keyword frequency.
     *
     * @param sentence full sentence
     * @param word word to search
     * @return count of occurrences
     */
    public int countWordOccurrences(String sentence, String word) {
        // Convert to lowercase and split
        return 0;
    }
}