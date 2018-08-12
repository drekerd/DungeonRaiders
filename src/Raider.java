import java.awt.EventQueue;

import javax.swing.JFrame;

import java.io.IOException;


public class Raider {

	
	public static void main(String[] args) throws IOException {
		
		
		Player tim = new Player("Mário");
        tim.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        tim.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        tim.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        tim.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        tim.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        tim.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        tim.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        tim.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        tim.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        tim.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        tim.showInventory();
        
//		MainFrame frame = new MainFrame();
        
		MainFrame.launcFrame();
		
		//Fight With VampyreKing folded here
		//
		//
		// Enemy enemy = new Enemy("Test Enemy",10,3);


//		        Troll uglyTroll = new Troll("Ugly Troll");
		//
//		        System.out.println("Enemy: "+uglyTroll.getName());
//		        uglyTroll.takeDamage(30);


//		        Vampyre vlad = new Vampyre("Vlad");
//		        vlad.showInfo();
//		        vlad.takeDamage(8);
//		        vlad.showInfo();

//		        VampyreKing vampyreKing= new VampyreKing("Destroyus");
		//
//		        vampyreKing.showInfo();
		//
//		         while(vampyreKing.getLives()>0) {
		//
//		            if(vampyreKing.dodges()) {
//		                continue;
//		            }
		//
//		            if (vampyreKing.runAway()) {
//		                System.out.println("Destroyus ran away");
//		                break;
//		            }else{
//		                    vampyreKing.takeDamage(12);
//		                    vampyreKing.showInfo();
//		            }
//		         }
		        
				
				
				
				
				
		        
//		        
//
//		        System.out.println(tim.score());
//		        tim.dropLoot("cursed shield");
//		        System.out.println(tim.score());
//		        System.out.println("======================");
//		        tim.showInventory();
		
	}
	
	
}
