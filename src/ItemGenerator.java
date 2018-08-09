import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ItemGenerator {

    private String[] itemQuality={"Bronze","Silver","Gold","Platinium"};
    private String[] itemClass ={"Retributioner", "Protectioner", "Healinger"};
    private String itemClassSet;
    private String itemQualitySet;

    private int itemLevel;


    Random rand = new Random();

    public int getItemLevel() {

        int n = rand.nextInt(100)+1;
        this.itemLevel = n;

        return itemLevel;
    }

    public String getItemQuality() {
        int n = rand.nextInt(100)+1;

        if(n <=40){
            itemQualitySet = Arrays.asList(itemQuality).get(0);
        }else if(n > 40 && n <= 70){
            itemQualitySet = Arrays.asList(itemQuality).get(1);
        }else if(n > 70 && n<=90){
            itemQualitySet = Arrays.asList(itemQuality).get(2);
        }else if(n > 90 && n <=100){
            itemQualitySet = Arrays.asList(itemQuality).get(3);
        }
        return itemQualitySet;
    }

    public String getItemClass() {
        int n = rand.nextInt(100)+1;

        if(n <=33){
                itemClassSet = Arrays.asList(itemClass).get(0);
            }else if(n > 33 && n <= 66){
                itemClassSet = Arrays.asList(itemClass).get(1);
            }else if(n > 66 && n<=100){
                itemClassSet = Arrays.asList(itemClass).get(2);

        }
        return itemClassSet;
    }

//    public void setItemLevel(){
//
//
//    }
//
//    public void setItemQuality(){
//
//
//
//    }
//    public void setItemClass(){
//
//
//
//    }

}

