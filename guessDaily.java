import java.util.ArrayList;
import java.util.Random;

public class guessDaily{
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
        if(guess != null && !guess.isEmpty()){
            for(Slot = 0; Slot < word.length(); Slot++){
                while (true) {
                    Guess = guess.get(6 + new Random().nextInt(guess.size() - 6));
                    if(word.charAt(Slot) == Guess.charAt(0)){
                        System.out.println(msg.get(0) + Slot + "\n" + msg.get(1) + Guess + "\n" + msg.get(2) + result[2]);
                        break;
                    }
                    if(word.contains(Guess)){
                        System.out.println(msg.get(0) + Slot + "\n" + msg.get(1) + Guess + "\n" + msg.get(2) + result[1]);
                    }else{
                    System.out.println(msg.get(0) + Slot + "\n" + msg.get(1) + Guess + "\n" + msg.get(2) + result[0]);
                    }
                }
            }
        }
    }
    public static void main(String st[]){
        guessDaily gD = new guessDaily();
        gD.checkGuess();
    }
}