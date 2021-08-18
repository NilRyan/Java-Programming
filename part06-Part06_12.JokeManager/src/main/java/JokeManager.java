
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilryan
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        return this.jokes.get(randomNumber());

    }
    
    public void printJokes() {
        for (String joke: this.jokes) {
            System.out.println(joke);
        }
    }

    private int randomNumber() {
        int max = this.jokes.size();
        int min = 0;

        return (int) ((Math.random() * (max - min)) + min);
    }

}
