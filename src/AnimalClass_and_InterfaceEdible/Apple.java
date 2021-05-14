package AnimalClass_and_InterfaceEdible;

public class Apple extends Fruit implements Edible {

    @Override
    public String howToEat() {
        return "Apple could be sliced";
    }
}
