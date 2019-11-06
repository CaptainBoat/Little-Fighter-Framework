package littlefighter;

public class Battle {
    Character p1, p2; 
    
	public Battle(Character p1,Character p2) 
    { 
        this.p1 = p1; 
        this.p2 = p2;
    }
	
	public void start() throws InterruptedException {
		System.out.println("start");
		Thread.sleep(1500);
		while (this.p1.health>0 && this.p2.health>0) {
			if (p1.active) {
			p2 = actturn(p1,p2);
			p1 = buffself(p1,p2);
			}
			else {
				p1 = passturn(p1,p2);
			}
			if (this.p2.health > 0) {
				if(p2.active) {
					p1 = actturn(p2,p1);
					p2 = buffself(p2,p1);
					}
				else {
					p2 = passturn(p2,p1);
				}				
			}
			
		}
		if (this.p1.health<=0) System.out.println("2p win");
		else if (this.p2.health<=0) System.out.println("1p win");
		
	}
	
	public Character actturn(Character a,Character b) throws InterruptedException {
		System.out.println(a.name + " attack, remaining" + a.health +"hp");
		Turn t1 = new Turn(a,b);
		b = t1.normatk();
		Thread.sleep(800);
		effect ef1 = new effect (a,b);
		if (!ef1.paratest()) b.active = false;
		if (!ef1.cursetest()) {
			b.cursed();			
			System.out.println(b.name + " is cursed");
			Thread.sleep(1500);
		}				
		return b;
	}
	
	public Character buffself(Character a,Character b) throws InterruptedException {
		effect ef1 = new effect (a,b);
		if (!ef1.lstest()) {
			System.out.println(a.name + " lsed");
			Thread.sleep(800);			
			a.althealth (a.attack * 0.3);			
			System.out.println(a.name + " regenerated");
			Thread.sleep(800);
		}
		return a;
	}
	
	public Character passturn(Character a,Character b) throws InterruptedException {
		System.out.println(a.name + " stunned");
		Thread.sleep(2000);
		a.active = true;
		return a;
	}
	
	
}
