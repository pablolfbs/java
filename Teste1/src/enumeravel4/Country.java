package enumeravel4;

public class Country {
	
	private Planet planet;
	private String name;
	
	public Country(Planet planet, String name) {
		super();
		this.planet = planet;
		this.name = name;
	}

	public Planet getPlanet() {
		return planet;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pa�s: " + this.getName() + "\nPlaneta: " + this.getPlanet() + "\nRadius: "
				+ this.getPlanet().getRadius() + "\nGravity: " + this.getPlanet().getGravity();
	}

}
