package recursion;

public class SimpleRecursion {

    public static void main(String[] args) {
        WordsRecursion wr = new WordsRecursion();
        wr.repeatWords(5, "Hello");
    }
}

class WordsRecursion {

    public void repeatWords(int times, String word) {
        if(times != 0){
            System.out.println(word);
            repeatWords((times - 1), word);
        }
    }
}