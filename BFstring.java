import java.util.ArrayList;
import java.util.List;

public class BFstring {

    public static void main (String args []){
        System.out.println("========String matcher Brute Force Approach===========");
        String text = "abcabbabbaabac";
        String pattern = "abba";
        long initialTime = System.nanoTime();
        List<Integer> matchedIndexes = bruteForceStringMatcher(text, pattern);
        long finalTime = System.nanoTime();
        for(Integer matchedIndex : matchedIndexes){
            System.out.println("Pattern found at "+matchedIndex);
        }

        if(matchedIndexes.size() == 0)
            System.out.println("Pattern not found");

        System.out.println("Time taken for matching "+(finalTime-initialTime));
    }



    public static List<Integer> bruteForceStringMatcher(String text, String pattern){

        char[] textArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();

        int textLength = textArray.length;
        int patternLength = patternArray.length;

        List<Integer> matchedIndexes = new ArrayList<>();

        int textIndex = 0;


        for(textIndex = 0; textIndex < textLength; textIndex++){
            int textIndexLocal = textIndex;
            Boolean match = true;
            int matchedIndex = textIndex;
            for(int patternIndex = 0; patternIndex < patternLength; patternIndex++){
                if(textArray[textIndexLocal] != patternArray[patternIndex]) {
                    match = false;
                    break;
                }
                textIndexLocal = textIndexLocal + 1;
            }
            if(match)
                matchedIndexes.add(matchedIndex);
        }
        return matchedIndexes;
    }

}