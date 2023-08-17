package iterasi.review1._2javaoop.exampleinheritance.character;




public class Enemy extends Character{
    private String placeSpawn;

    public Enemy(String characterRole, String placeSpawn) {
        super(characterRole);
        this.placeSpawn = placeSpawn;
    }

    public Enemy(String placeSpawn) {
        this.placeSpawn = placeSpawn;
    }
}
