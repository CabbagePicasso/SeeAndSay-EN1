package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class til864760 extends Animal implements Talker {
    @Override
    public String getAuthor() {
        return "Chris Tillette";
    }

    @Override
    public String getAnimalName() {
        return "Energetic Sloth";
    }

    @Override
    public String getSound() {
        return "I only slept 10 hours today, I need my full 15 hours!";
    }

    @Override
    public String getDescription() {
        return "Energetically lazy";
    }
}
