import java.util.Arrays;

/**
 * 🧠 Java String Methods Drill Sheet
 *
 * Проблематика:
 * В этой задаче вы реализуете часто встречающиеся методы обработки строк,
 * полезные при валидации, фильтрации или форматировании данных в веб-приложениях и API.
 *
 * 🎯 Цель:
 * Реализовать каждый метод, используя базовые String-методы Java.
 */
public class StringDrill {

    /**
     * ✅ Проверяет, является ли строка палиндромом.
     * Палиндром читается одинаково слева направо и справа налево.
     *
     * Подсказка:
     * - Привести к нижнему регистру.
     * - Удалить пробелы.
     * - Перевернуть строку и сравнить с оригиналом.
     */
    public boolean isPalindrome(String input) {
        if (input == null) return false;

        // Шаг 1: Приводим к нижнему регистру и удаляем пробелы
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Шаг 2: Переворачиваем строку
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Шаг 3: Сравниваем перевёрнутую строку с оригиналом
        return normalized.equals(reversed);
    }

    /**
     * ✅ Заменяет все гласные в строке на символ 'Ъ'.
     *
     * Подсказка:
     * - Использовать регулярное выражение: (?i)[aeiouаеёиоуыэюя]
     * - (?i) включает регистронезависимость.
     * - replaceAll заменит все вхождения гласных.
     */
    public String replaceVowels(String input) {
        if (input == null) return null;

        // Заменяем все гласные символом Ъ (русские и английские гласные)
        return input.replaceAll("(?i)[aeiouаеёиоуыэюя]", "Ъ");
    }

    /**
     * ✅ Делает первую букву каждого слова заглавной, остальные — строчными.
     *
     * Подсказка:
     * - Разделить строку на слова по пробелу.
     * - Каждое слово: первая буква — заглавная, остальные — строчные.
     * - Соединить слова обратно.
     */
    public String capitalizeWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Приводим всё к нижнему регистру и разбиваем по пробелам
        String[] words = sentence.toLowerCase().split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Первая буква — заглавная, остальное — строчное
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Удаляем лишний пробел в конце
        return capitalized.toString().trim();
    }

    /**
     * ✅ Подсчитывает, сколько раз слово встречается в предложении (без учёта регистра).
     *
     * Подсказка:
     * - Привести предложение и искомое слово к нижнему регистру.
     * - Разделить предложение на слова по пробелу.
     * - Сравнивать каждое слово с искомым.
     */
    public int countWordOccurrences(String sentence, String word) {
        if (sentence == null || word == null || sentence.isEmpty() || word.isEmpty()) {
            return 0;
        }

        // Приводим всё к нижнему регистру
        String[] words = sentence.toLowerCase().split("\\s+");
        String target = word.toLowerCase();

        int count = 0;
        for (String w : words) {
            if (w.equals(target)) {
                count++;
            }
        }

        return count;
    }

    /**
     * 🔍 Точка входа для быстрой проверки методов
     */
    public static void main(String[] args) {
        StringDrill drill = new StringDrill();

        // Тестируем isPalindrome
        System.out.println(drill.isPalindrome("Racecar"));                // true
        System.out.println(drill.isPalindrome("A man a plan a canal Panama")); // true
        System.out.println(drill.isPalindrome("Hello"));                 // false

        // Тестируем replaceVowels
        System.out.println(drill.replaceVowels("Привет, как дела?"));    // ПрЪвЪт, кЪк дЪлЪ?
        System.out.println(drill.replaceVowels("Hello World"));          // HЪllЪ WЪrld

        // Тестируем capitalizeWords
        System.out.println(drill.capitalizeWords("java IS fun"));        // Java Is Fun
        System.out.println(drill.capitalizeWords("  hello   world  "));  // Hello World

        // Тестируем countWordOccurrences
        System.out.println(drill.countWordOccurrences("Java is fun and java is powerful", "java")); // 2
        System.out.println(drill.countWordOccurrences("hello Hello hElLo", "hello"));               // 3
    }
}
