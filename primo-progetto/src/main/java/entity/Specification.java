package entity;

public class Specification {
	
	private final Color color;
	private final EngineType enginetype;
	
	public Specification(Color color, EngineType enginetype) {
		//super();
		this.color = color;
		this.enginetype = enginetype;
	}

	public Color getColor() {
		return color;
	}

	public EngineType getEnginetype() {
		return enginetype;
	}	
}
