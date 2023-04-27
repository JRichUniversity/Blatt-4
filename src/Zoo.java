public class Zoo {
    public static void main(String[] args){
        Tier ralf = new Loewe(200, 200, 2.0, 200.0, "Wow", "Bananen", "Uganda", "Wüsten");
        ralf.printHabitatSize();
        ralf.getName();
        Kaefig g1 = new Kaefig(200, 200, 200, "Loewen Gehege", true, true, false, false);
        g1.addAnimal(ralf);
    }
}
