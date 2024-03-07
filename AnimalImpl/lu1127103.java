package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class lu1127103 extends Animal implements Talker {
    @Override
    public String getAuthor() {
        return "Ariel Luces";
    }

    @Override
    public String getAnimalName() {
        return "Witty Beaver";
    }

    @Override
    public String getSound() {
        return "I hiss, I grunt, I scream.";
    }
    @Override
    public String getDescription() {
        return "chuck";
    }
}
