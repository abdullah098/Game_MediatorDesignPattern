package dp_assignment_3;

public enum Actions {
	
	Swing("Draw Sword", "use his shield", 2),
	Search("Find Gold", "fights for his share of the gold", 6),
	Throw("Cast a Spell", "sees in astonishment", 7);
			
	private String a;
	private String r;
	private int c;
			
	Actions(String action, String responce, int cost) {
		this.a = action;
		this.r = responce;
		this.c = cost;
	}
			
	public String getR() {
		return this.r;
	}
			
	public int getC() {
		return this.c;
	}
			
	public String getA() {
		return this.a;
	}

}
