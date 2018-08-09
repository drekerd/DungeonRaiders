public class Vampyre extends Enemy{

    public Vampyre(String name) {
        this(name, 20, 3);
    }
    public Vampyre(String name, int hitPoints,int lives){
        super(name,hitPoints,lives);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }


}
