// Exo 14.7 
 

import java.util.Scanner;
import java.util.StringTokenizer;

public class piglatin {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter An English Sentence And Press Enter");
        String Sentence = scanner.nextLine();

        String[] sentenceTokens = Sentence.split(" ");

        for (String word : sentenceTokens)
        {
            StringBuilder wordBuilder = new StringBuilder(word);

            char firstChar = word.charAt(0);

            wordBuilder.deleteCharAt(0);

            wordBuilder.append(firstChar)
                       .append("ay")
                       .append(" ");

            System.out.printf("%s", wordBuilder );
        }
    }
}