package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class mi1156959 extends Animal implements Talker {

    @Override
    public String getAuthor() {
        return "Ethan Milligan";
    }

    @Override
    public String getAnimalName() {
        return "Dodo";
    }

    @Override
    public String getSound() {
        return "Coo-coo";
    }
    @Override
    public String getDescription() {
        return "Extinct Bird";
    }
}
