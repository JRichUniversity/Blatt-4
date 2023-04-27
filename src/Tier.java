public abstract class Tier {
    public int weight, amountOfFood;
    public double temp, habitatSize;
    public String animalNoise, pray, origin, naturalHabitat;
    public boolean landAnimal, inHabitat;
    public String land = " m²";
    public String sea = " m³";

    public void primaryPray(){
        if(this.pray != null){
            System.out.println("Ich bin ein " + this.getClass().getSimpleName() + " und jage " + pray.getClass().getSimpleName() + ".");
        } else System.out.println("Ich jage nicht.");
    }
    public int getWeight(){
        return weight;
    }

    public int amountOfFood() {
        return amountOfFood;
    }

    public double getTemp() {
        return temp;
    }

    public double getHabitatSize() {
        return habitatSize;
    }

    public void printHabitatSize() {
        if(landAnimal){
            System.out.println("Habitat size: " + habitatSize + land);
        } else {
            System.out.println("Habitat size: " + habitatSize + sea);
        }
    }

    public String animalNoise() {
        return animalNoise;
    }

    public void getName(){
        System.out.println(origin + " " + naturalHabitat + " " + this.getClass().getSimpleName());
    }

    Tier(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat){
        this.weight = weight;
        this.amountOfFood = amountOfFood;
        this.temp = temp;
        this.habitatSize = habitatSize;
        this.animalNoise = animalNoise;
        this.origin = origin;
        this.naturalHabitat = naturalHabitat;
    }
}

abstract class Saeugetier extends Tier{
    Saeugetier(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
    }
}

abstract class Voegel extends Tier{
    Voegel(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
    }
}

abstract class Reptilien extends Tier{
    Reptilien(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
    }
}

abstract class Fische extends Tier{
    boolean salzwasserfisch;
    Fische(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat, Boolean salzwasserfisch) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
        this.salzwasserfisch = salzwasserfisch;
    }

    public void getName(){
        if(salzwasserfisch){
            System.out.println(origin + " Salzwasser " + " " + this.getClass().getSimpleName());
        }
        else System.out.println(origin + " Süßwasserfisch " + " " + this.getClass().getSimpleName());
    }

    public boolean isSalzwasserfisch() {
        return salzwasserfisch;
    }
}

abstract class Insekten extends Tier{
    Insekten(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
    }
}

abstract class Spinnentiere extends Tier{
    Spinnentiere(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
    }
}

abstract class Wirbellose extends Tier{
    Wirbellose(int weight, int amountOfFood, double temp, double habitatSize, String animalNoise, String origin, String naturalHabitat) {
        super(weight, amountOfFood, temp, habitatSize, animalNoise, origin, naturalHabitat);
    }
}