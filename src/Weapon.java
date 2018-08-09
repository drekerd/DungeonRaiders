public class Weapon {

    private String name;
    private int damageInflicted;
    private int hitPoints;

    public Weapon(String name, int damageInflicted, int hitPoints){
        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
    }

//  Getters

    public String getname(){
        return name;
    }
    public int getDamageInflicted(){
        return damageInflicted;
    }
    public int getHitPoints(){
        return hitPoints;
    }

//  Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
