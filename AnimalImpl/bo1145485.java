package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class bo1145485 extends Animal implements Talker {

    //author
    @Override
    public String getAuthor() {
        return "Max Booz";
    }

    //name
    @Override
    public String getAnimalName() {
        return "Reliable Dog";
    }

    //sound
    @Override
    // source: common knowledge
    public String getSound() {
        return "Bark bark, woof woof, wow!";
    }

    //description
    @Override
    public String getDescription() {
        return "Dogs are commonly depicted in memes, referred to as doggos. Doge was the most popular doggo, and sadly has died. Some say Doge still lives on in the dark corners of memes.";
    }

}
// just add this and animal list maker