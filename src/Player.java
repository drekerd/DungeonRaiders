import java.util.ArrayList;

	public class Player {

	    private String handleName;
	    private int lives;
	    private int level;
	    private int score;
	    private Weapon weapon;
	    private ArrayList<Loot> inventory;

	    public Player() {
	        this("Unkown Player");

	    }
	    public Player(String handleName){
	        this(handleName,1);

	    }
	    public Player(String handleName, int level){
	        setHandleName(handleName);
	        setLives(3);
	        setLevel(level);
	        setScore(0);
	      setDefaultWeapon(); //creates weapon
	        inventory = new ArrayList<>();
	    }

	    private void setDefaultWeapon(){
	        this.weapon = new Weapon("Mace",10,10);
	    }

	    public void setNameAndLevel(String name, int level){
	        setHandleName(name);
	        setLevel(level);
	    }

	    public String getHandleName() {
	        return this.handleName;
	    }

	    public void setHandleName(String handleName) {
	        boolean isNameCorrect = (handleName.length() < 4);
	        if (isNameCorrect)
	        {
	            System.out.println("The name " + handleName +" must be more than 4 characters");
	            return;
	        }
	        this.handleName = handleName;

	    }

	    public int getLives() {
	        return lives;
	    }

	    public void setLives(int lives) {
	        this.lives = lives;
	    }

	    public int getLevel() {
	        return level;
	    }

	    public void setLevel(int level) {
	        this.level = level;
	    }

	    public int getScore() {
	        return score;
	    }

	    public void setScore(int score) {
	        this.score = score;
	    }

	    public void setWeapon(Weapon weapon) {
	        this.weapon = weapon;
	    }

	    public Weapon getWeapon() {
	        return weapon;
	    }

	    public ArrayList<Loot> getInventory() {
	        return inventory;
	    }

	    public void pickUpLoot (Loot newLoot){
	        inventory.add(newLoot);
	    }

	    public boolean dropLoot (String name){

	        for(Loot item : inventory){
	            if(item.getName().equalsIgnoreCase(name)) {
	                System.out.println(item.getName() + " was Deleted");
	                inventory.remove(item);
	                return true;
	            }
	        }
	        System.out.println("Failed deleating item");
	        return false;
	    }

	    public boolean dropLoot (Loot loot, String name){
	        if(this.inventory.contains(loot)){
	            System.out.println(loot.getName()+ " was Deleted");
	            inventory.remove(loot);

	            return true;
	        }
	        return false;
	    }



	    public void showInventory(){

	        System.out.println("Inventory Items: ");
	        ArrayList<Loot> allItems = getInventory();
	        for(Loot item : allItems){
	            System.out.println("- "+item.getName().concat(" ").concat(String.valueOf(item.getValue())));
	        }
	        System.out.println("==============================");
	    }

	    public int score(){

	        int total = 0;

	        for(Loot allLoot : inventory) {
	            total = total + allLoot.getValue();
	        }
	        return total;
	    }
	}

