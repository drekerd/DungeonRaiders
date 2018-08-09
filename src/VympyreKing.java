import java.util.Random;

public class VampyreKing extends Vampyre{

    public VampyreKing(String name) {
        super(name,140,4);

    }
    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage/2);
    }
    public boolean runAway(){

//        if(getLives()<2){
//            return true;
//        }else{
//            return false;
//        }
        return (getLives()<2);

    }
    public boolean dodges(){

        Random rand = new Random();
        int change = rand.nextInt(6);

        if(change >4){
            System.out.println("* "+this.getName()+" has dodged the Attack *");
            return true;
        }
            return false;



    }
}
