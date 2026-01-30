import java.util.ArrayList;
import java.util.Random;

public class guessRandom {
    enum ResultKind{absent,present,correct}
    
    ArrayList<String> loc = new ArrayList<>(){{
        add("apple"); // the answer type
        add("lemon");
        add("money");
    }};
    
    ArrayList<String> guess = new ArrayList<>(){{
        add("hello"); // test cases
        add("lemon");
        add("clown");
        add("money");
        add("apple");
        add("Trees");
        // test cases for guessDaily
        add("a");
        add("e");
        add("l");
        add("m");
        add("n");
        add("o");
        add("p");
        add("y");
    }};
    
    ArrayList<String> msg = new ArrayList<>(){{
        add("slot: ");
        add("guess: ");
        add("result: ");
    }};

    ResultKind[] result = ResultKind.values();
    int Slot;

    String word = loc.get(new Random().nextInt(loc.size()));
    String Guess;

    private void checkGuess(){
        if(guess != null && !guess.isEmpty()){ // keep random choose a new word for the answer 
            Slot = loc.indexOf(word);
            Guess = guess.get(new Random().nextInt(6));
            while(!Guess.equals(word)){
                System.out.println(msg.get(0) + Slot + "\n" + msg.get(1) + Guess + "\n" + msg.get(2) + result[0]);
                word = loc.get(new Random().nextInt(loc.size()));
                Slot = loc.indexOf(word);
                Guess = guess.get(new Random().nextInt(6));
            }
            System.out.println(msg.get(0) + Slot + "\n" + msg.get(1) + Guess + "\n" + msg.get(2) + result[2]);
        }
    }
    public static void main(String[] args) {
        guessRandom gR = new guessRandom();
        gR.checkGuess();
    }
}
