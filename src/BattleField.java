
public class BattleField {
	
	
	Vampyre vampyre = new Vampyre("Enemy Test");
	
	private int damage;
	
	public void setAttack(int who) {
		
		if(who == 1) {
			this.damage = 8;
			vampyre.takeDamage(damage);
			
		}
		
	}
	
	public int getDamage() {
		System.out.println("return Damage "+damage);
		return this.damage;
	}
	
	
	
	
	
	

}
