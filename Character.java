package littlefighter;

public class Character {
	float health, attack, defense, ablity, luck;
	boolean active;
	String name;
    
	public Character(String name, float health,float attack,float defense,float ablity,float luck,boolean active) 
    { 
        this.name = name;
		this.health = health; 
        this.attack = attack;
        this.defense = defense;
        this.ablity = ablity;
        this.luck = luck;
        this.active = active;
    }

	public void cursed() {
		this.attack *= 0.6;
		this.defense *= 0.6;
		this.ablity *= 0.6;
		this.luck *= 0.6;
	}
	
	public void althealth (double d) {
		this.health += d;						
	}
	
}
