import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends with 5 stars *****";
        String secondString = "1,2,3,4,5,6,7,8";


        System.out.print("first String replaced * with ^: " + firstString.replaceAll("\\*", "^"));
        System.out.println();
        System.out.print("first string replaced stars with carters: " + firstString.replaceAll("stars","carters"));
        System.out.println();
        System.out.print("replace all words in first string with Word: " + firstString.replaceAll("\\w+","WORD"));
        System.out.println();
        for(int i = 0; i<3; i++)
            secondString = secondString.replaceFirst("\\d","GIG");
        System.out.print("replace the first 3 digits in second string: "+ secondString);
        System.out.println();
        String [] result = secondString.split(",\\s*");
        System.out.println(Arrays.toString(result));

    }
}