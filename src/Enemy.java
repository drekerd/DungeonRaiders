import java.util.Random;

public class Enemy {
	 private String name;
	    private int hitPoints;
	    private int lives;
	    private int damageReturn;
	    private boolean hasDodged;
	    private String type;


	    public Enemy(String name, int hitPoints, int lives, String type) {
	        this.name = name;
	        this.hitPoints = hitPoints;
	        this.lives = lives;
	        this.type = type;
	     
	    }

	    public void takeDamage(Weapon weapon){
	    	
	    	int damage = calculateDamageInfliced(weapon.getDamageInflicted());
	    	
	    	if(this.type.equalsIgnoreCase("Boss")) {
	    		damage = damage/4;
	    	}
	        int remainingHitPoints = this.hitPoints - damage;
	        this.damageReturn = damage;
	        System.out.print(this.getName()+" took "+ damage + " damage!");
	        if(remainingHitPoints>0){
	            setHitPoints(remainingHitPoints);
	            System.out.println("He still has "+this.hitPoints+" left");
	            
	        }else{
	            this.lives = this.lives-1;
	            if(lives >0){
	                this.lives = this.lives-1;
	                System.out.println(" I have lost a live");
	            }else{
//	                System.out.println();
	                System.out.println("\n"+this.getName()+" is Dead!!");

	            }

	        }
	    }
	    
	    public int calculateDamageInfliced(int damage) {
	    	
	    	Random rand = new Random();
	    	int upOrLow = rand.nextInt(2);
	    	int weaponHalfDamage = damage/2;
	    	int damageDone = 0;
	    	System.out.println("UpOrLow "+upOrLow);
	    	//if random is 0, damage will decrease a random value down to half of the Damage Value of the weapon equiped
	    	//if random is 1, damage will increase a random value up to half of the Damage Value of the weapon equiped 
	    	if(upOrLow != 1) {
	    		
	    		int randomDamage = rand.nextInt(weaponHalfDamage)+1;
	    		damageDone = damage - randomDamage;
	    		System.out.println("Damage Done " + damageDone);
	    		System.out.println("Random de Damage "+randomDamage);
	    		
	    	}else if(upOrLow == 1) {
	    		
	    		int randomDamage = rand.nextInt(weaponHalfDamage)+1;
	    		damageDone = randomDamage + damage;
	    		System.out.println(damageDone);
	    		System.out.println("Damage Done " + damageDone);
	    		System.out.println("Random de Damage "+ randomDamage);
	    	}
	    	System.out.println("DamageDoneReturn " + damageDone);
	    	return damageDone;
	    }
	    
	   
	    public void showInfo(){
	        System.out.println("Name: "+ this.name+", HitPoints: "+this.hitPoints+", Lives: "+this.lives);
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getHitPoints() {
	        return hitPoints;
	    }

	    public void setHitPoints(int hitPoints) {
	        this.hitPoints = hitPoints;
	    }

	    public int getLives() {
	        return lives;
	    }

	    public void setLives(int lives) {
	        this.lives = lives;
	    }
	    public boolean getDodge (boolean dodge) {
	    	hasDodged = dodge;
	    	return hasDodged;
	    }
	    public String toString() {
	    	
	    	if(hasDodged) {
	    		return "<html> <br/> <html>" + getName().concat(" Dodged the Attack ");
	    	}else {
	    		return "<html> <br/> <html>" + getName().concat(" took ").concat(Integer.toString(damageReturn)).concat(" damage");
	    	}
	    
	    }
	    
	    public  String getType() {
	    	return this.type;
	 
	    }
	    
	    public void setType(String type) {
	    	this.type = type;
	    	
	    }
	    
	    
	    
}
