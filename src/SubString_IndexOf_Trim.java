/*
Asks users to enter a string that contains 3 words separated by comma
Print those 3 words separate in different lines
*/
import java.util.Scanner;

public class SubString_IndexOf_Trim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 words, separate them by comma: ");
        String str = input.nextLine();

        String word1 = "";
        String word2 = "";
        String word3 = "";

        int firstComma = str.indexOf(',');

        if(firstComma > 0) {
            word1 = str.substring(0, firstComma);
            int secondComma = str.indexOf(',', firstComma + 1);
            if(secondComma > 0) {
                word2 = str.substring(firstComma + 1, secondComma);
                word3 = str.substring(secondComma + 1);
            }
            else {
                word2 = str.substring(firstComma + 1);
            }
        }
        else {
            word1 = str;
        }

        word1 = word1.trim();
        word2 = word2.trim();
        word3 = word3.trim();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }

}
