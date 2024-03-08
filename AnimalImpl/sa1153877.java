package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class sa1153877 extends Animal implements Talker {

    @Override
    public String getAuthor() {
        return "Abby Salisbury";
    }

    @Override
    public String getAnimalName() {
        return "Shark";
    }

    @Override
    // BBC Science Focus (sharks don't make sound don't trust Jaws 4)
    public String getSound() {
        return "I can smell blood from around a quarter mile away.";
    }

    @Override
    public String getDescription() {
        return "Eager Shark";
    }

}
