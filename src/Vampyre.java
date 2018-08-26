public class Vampyre extends Enemy{

    public Vampyre(String name) {
        this(name, 20, 3,"Boss");
    }
    public Vampyre(String name, int hitPoints,int lives, String type){
        super(name,hitPoints,lives,type);
    }

    @Override
    public void takeDamage(Weapon weapon) {
        super.takeDamage(weapon);
    }


}
