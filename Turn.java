package littlefighter;

public class Turn {
    Character p1, p2; 
	
	public Turn(Character p1,Character p2) 
    { 
        this.p1 = p1; 
        this.p2 = p2;
    }
	
	public Character normatk() {
		p2.health -= p1.attack;
		return p2;
	}
	
	
}
