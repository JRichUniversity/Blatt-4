public interface Predator {

    public static void hunt(Tier prey){}

    public static Tier primaryPray(){
        return new Karpfen(200,200,200,200,"Yeet", "Ghana", "Water", false);
    }
}
