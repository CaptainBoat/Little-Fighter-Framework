package littlefighter;

public class effect {
	Character p1, p2;
	public effect(Character p1, Character p2) 
    { 
        this.p1 = p1; 
        this.p2 = p2;        
    }
	
	public boolean paratest() {
		return (((this.p2.luck)/100.0+1)*Math.random() > 0.25);
	}
	
	public boolean cursetest() {
		return (((this.p2.luck)/100.0-(this.p1.ablity)/100.0+1)*Math.random() > 0.35);
	}

	public boolean lstest() {
		return (((this.p2.luck)/100.0-(this.p1.ablity)/100.0+1)*Math.random() > 0.35);
	}
}
