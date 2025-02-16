package lambdaFuncitons;

@FunctionalInterface
interface WordCounter {
    int countWords(String string);
}

public class qno13 {
    public static void main(String[] args) {

        String text = "Counting words in this text";

        // https://www.geeksforgeeks.org/write-regular-expressions/
        WordCounter wordCounter = s -> s.split("\\s+").length;

        int numOfCounts = wordCounter.countWords(text);

        System.out.println("The number of words is: " + numOfCounts);
    }
}
