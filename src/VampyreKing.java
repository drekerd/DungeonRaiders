import java.util.Random;

public class VampyreKing extends Vampyre{
	
	
	
    public VampyreKing(String name) {
        super(name,140,1,"Boss");

    }
    @Override
    public void takeDamage(Weapon weapon){
    	int i =0;
    	while(i == 0){
    		if(this.dodges()) {
    			i++;
    			continue;
    	}else {
    		i++;
    		super.takeDamage(weapon);
    	}
    		
        }
        
    }
    public boolean runAway(){

//        if(getLives()<2){
//            return true;
//        }else{
//            return false;
//        }
        return (getLives()<2);

    }
    private boolean dodges(){

        Random rand = new Random();
        int change = rand.nextInt(6);

        if(change >4){
            super.getDodge(true);
            System.out.println("Dodged");
            return true;
        }
        	super.getDodge(false);
            return false;
    }
    
}
