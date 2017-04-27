package polimorfismo;

public class Secretary extends Employee {
	
	private float baseSalary;
	private float bonus;

	public Secretary(String name, float baseSalary, float bonus) {
		super(name);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public float getSalary() {
		return this.baseSalary + this.bonus;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getName() + "\nSalário: " + this.getSalary() + "\n";
	}
	
}
