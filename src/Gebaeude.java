import java.util.ArrayList;
public abstract class Gebaeude {
    int size, posX, posY, id;
    static int running_id = 0;
    String name;


    Gebaeude(int s, int x, int y, String n){
        size = s;
        posX = x;
        posY = y;
        name = n;
        id = ++running_id;
    }

    public Object getType(){
        return this.getClass();
    }
}

abstract class Gehege extends Gebaeude{
    ArrayList<Tier> tiere = new ArrayList<Tier>();
    Gehege(int s, int x, int y, String n) {
        super(s, x, y, n);
    }

    public void addAnimal(Tier animal){
        if(checkValidity(animal)) {
            tiere.add(animal);
            animal.inHabitat = true;
            System.out.println("Success");
        }
    }

    public void removeAnimal(Tier animal){
        if(tiere.contains(animal)){
            tiere.remove(animal);
            animal.inHabitat = false;
            System.out.println("Success");
        }
    }

    boolean checkValidity(Tier animal){
        if(this.size >  animal.habitatSize + habitatOccupation()){
            System.out.println("Gehege nicht groß genug.");
            return false;
        }
        if(!tiere.isEmpty()){
            if(animal.getClass() != tiere.get(0).getClass()){
                System.out.println("Tiere nicht vom selben Typ.");
                return false;
            }
        }
        if(animal.inHabitat){
            return false;
        }
        if(animal instanceof Fische) {
            return isSalzwasser() == ((Fische) animal).salzwasserfisch;
        }
        return true;
    }

    boolean isSalzwasser(){
        return true;
    }

    int habitatOccupation(){
        int x = 0;
        for(Tier element : tiere){
            x += element.habitatSize;
        }
        return x;
    }

    int remainingSpace(){
        return size - habitatOccupation();
    }
}

class Kaefig extends Gehege{
    boolean tranke, baeume, seile, hoelle;
    Kaefig(int s, int x, int y, String n, Boolean tranke, Boolean baeume, Boolean seile, Boolean hoelle) {
        super(s, x, y, n);
        this.tranke = tranke;
        this.baeume = baeume;
        this.seile = seile;
        this.hoelle = hoelle;
    }

    public boolean hasTranke() {
        return tranke;
    }

    public boolean hasBaeume() {
        return baeume;
    }

    public boolean hasSeile() {
        return seile;
    }

    public boolean hasHoelle() {
        return hoelle;
    }
}

class Aquarium extends Gehege{
    boolean salzwasser;
    Aquarium(int s, int x, int y, String n, boolean salzwasser) {
        super(s, x, y, n);
        this.salzwasser = salzwasser;
    }

    public boolean isSalzwasser() {return salzwasser;}
}

abstract class Freizeiteinrichtung extends Gebaeude{
    Freizeiteinrichtung(int s, int x, int y, String n) {
        super(s, x, y, n);
    }
}

class Restaurant extends Freizeiteinrichtung{
    int anzSitzplaetze;
    Restaurant(int s, int x, int y, String n, int anzSitzplaetze) {
        super(s, x, y, n);
        this.anzSitzplaetze = anzSitzplaetze;
    }

    public int getAnzSitzplaetze() {
        return anzSitzplaetze;
    }
}

class Shop extends Freizeiteinrichtung{
    String oeffnungsZeiten;
    Shop(int s, int x, int y, String n, String oeffnungsZeiten) {
        super(s, x, y, n);
        this.oeffnungsZeiten = oeffnungsZeiten;
    }

    public String getOeffnungsZeiten() {
        return oeffnungsZeiten;
    }
}

class Spielplatz extends Freizeiteinrichtung{
    int anzRutschen;
    Spielplatz(int s, int x, int y, String n, int anzRutschen) {
        super(s, x, y, n);
        this.anzRutschen = anzRutschen;
    }

    public int getAnzRutschen() {
        return anzRutschen;
    }
}