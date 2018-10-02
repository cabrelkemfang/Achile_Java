//exo 14.5
import java.security.SecureRandom;
public class randomsentence{
   public static  void main(String[] agrs){
	   SecureRandom randomNumbers = new SecureRandom();
        String[] article = {"a", "the", "some", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
		int o;
		for(o=0;o<=20;o++){
		int i=randomNumbers.nextInt(5);
		int j=randomNumbers.nextInt(5);
		int k=randomNumbers.nextInt(5);
		int l=randomNumbers.nextInt(5);
		int m=randomNumbers.nextInt(5);
		int n=randomNumbers.nextInt(5);
        StringBuilder sentence = new StringBuilder();
         sentence.append(article[i])
                .append(" ")
                .append(noun[j])
                .append(" ")
                .append(verb[k])
                .append(" ")
                .append(preposition[l])
                .append(" ")
                .append(article[m])
                .append(" ")
                .append(noun[n])
                .append(".");

        System.out.printf("%s\n", sentence);
		}
   }
}   