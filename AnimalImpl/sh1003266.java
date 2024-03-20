package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class sh1003266 extends Animal implements Talker {
    @Override
    public String getAuthor() { return "John Shearin";}

    @Override
    public String getAnimalName() {
        return "Hedgehog";
    }

    @Override
    public String getSound() {
        return "You're too slow.";
    }
    @Override
    public String getDescription() {return "I like to be encouraging but I gotta run.";}
}
