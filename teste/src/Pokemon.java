public class Pokemon {

    String name;
    int lvl;

    Pokemon() {
        lvl = 1;

    }

    Pokemon(String name, int lvl) {
        this.name = name;
        this.lvl = lvl;

    }

    void attack() {
        System.out.println(name + " use tackle!");
    }
    
}
