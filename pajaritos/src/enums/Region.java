package enums;

public enum Region {
	N("Norte"),
	S("Sur"),
	E("Este"),
	O("Oeste");
	
	private final String punto;
	
	private Region(String punto) {
		this.punto = punto;
	}
	
	@Override
	public String toString() {
		return this.punto;
	}
}
