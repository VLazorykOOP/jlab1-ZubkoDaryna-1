import java.util.Scanner;

public class fourthTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.;:\\-+&!?]");
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0); // 

            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                if (currentChar == firstLetter) {
                    word = word.substring(0, j) + word.substring(j + 1); 
                }
            }
                if(i>0){
                System.out.print(" " + word);}
                else{
            System.out.print(word);
                }
           
        }
        in.close();
    }
}


