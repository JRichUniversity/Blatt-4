public class Loewe extends Saeugetier implements Predator{
    Loewe(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String pray, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
        this.pray = pray;
        this.landAnimal = true;
    }
}

