package littlefighter;

public class User {

	public static void main(String[] args) throws InterruptedException {
		Character lst = new Character ("lst",110,10,20,10,5,true);
		Character wsq = new Character ("wsq",120,15,20,10,5,true);
		Battle a = new Battle(lst,wsq);
		a.start();				
	}
	
}
