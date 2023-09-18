import java.util.Scanner;

public class fourthTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* */ System.out.println("Input text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.;:\\-+&!?]");
        char firstLetter = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (i > 0) {
                word = word.replaceAll(String.valueOf(firstLetter), "");
                                System.out.print(" " + word);
            }
            if (i == 0) {
                System.out.print(word);
            } 
            
        }
        in.close();
    }
}
