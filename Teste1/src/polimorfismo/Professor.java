package polimorfismo;

public class Professor extends Employee {
	
	private int hoursMonthly;
	private float hoursValue;
	
	public Professor(String name, int hoursMonthly, float hoursValue) {
		super(name);
		this.hoursMonthly = hoursMonthly;
		this.hoursValue = hoursValue;
	}

	public int getHoursMonthly() {
		return hoursMonthly;
	}

	public void setHoursMonthly(int hoursMonthly) {
		this.hoursMonthly = hoursMonthly;
	}

	public float getHoursValue() {
		return hoursValue;
	}

	public void setHoursValue(float hoursValue) {
		this.hoursValue = hoursValue;
	}
	
	@Override
	public float getSalary() {
		return this.hoursMonthly * this.hoursValue;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getName() + "\nSalário: " + this.getSalary() + "\n";
	}

}
