package puzzles.strings;

public class StringTasks {


    public int calculateDots(String word) {

        if (word == null) {
            return 0;
        }

        return (int) word.chars()
                .mapToObj(a -> (char) a)
                .filter(b -> b.equals('.')).count();

    }


    public boolean checkRepeatableLetters(String word){


        return false;
    }

}
