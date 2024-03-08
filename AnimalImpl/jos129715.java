package SeeAndSay.AnimalImpl;
import SeeAndSay.Talker;
import SeeAndSay.Animal;

public class jos129715 extends Animal implements Talker {
    @Override
    public String getAuthor() {
        return "Logan Joseph";
    }

    @Override
    public String getAnimalName() {
        return "Elephant";
    }

    @Override
    public String getSound() {
        return "Im a elephant and im very big ";
    }
    @Override
    public String getDescription() {
        return "Quick elephant";
    }
}
