package SeeAndSay.AnimalImpl;
import SeeAndSay.Animal;
import SeeAndSay.Talker;
import SeeAndSay.AnimalListMaker;

public class ch1106737 extends Animal implements Talker {

    @Override
    public String getAuthor() {
        return "Marcus Charles";
    }

    @Override
    public String getAnimalName() {
        return "Crocodile";
    }

    @Override
    public String getSound() {
        return "Proud owner of the strongest bite force in the animal kingdom.";
    }

    @Override
    public String getDescription() {
        return "Wise crocodile";
    }
}
