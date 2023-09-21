import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fourth {
    public static void main(String[] args) {
        String inputString = "rfvbr tghht"; // Замініть це на ваш рядок
        
        // Створюємо множину для відстеження вже зустрічених букв
        Set<Character> seenLetters = new HashSet<>();
        
        // Будемо зберігати результат у цій змінній
        StringBuilder result = new StringBuilder();
        
        // Проходимося по кожному символу у рядку
        for (int i = 0; i < inputString.length(); i++) {
            char letter = inputString.charAt(i);
            
            // Якщо буква ще не була зустрінута раніше, додаємо її до результату
            if (!seenLetters.contains(letter)) {
                result.append(letter);
                seenLetters.add(letter);
            }
        }
        
        System.out.println("Результат: " + result.toString());
    }
}
