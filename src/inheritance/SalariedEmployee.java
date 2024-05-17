package inheritance;

public class SalariedEmployee extends Employee {
	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate,
			long annualSalary) {
		super(name, birthDate, employeeId, hireDate);
		this.annualSalary = annualSalary;
	}

	@Override
	public double collectPay() {
		return annualSalary / 12;
	}

	public void retire() {
		isRetired = true;
	}
}
