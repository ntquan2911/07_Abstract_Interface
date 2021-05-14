package AnimalClass_and_InterfaceEdible;

public class Orange extends Fruit implements Edible{

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
