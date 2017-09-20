package company;
import person.*;

public class manager extends employee{
	float salary;
	int unit;
	float bonus;
	public float b_onus()
	{

	if (unit  < 100) {
		bonus =(float)0.1*salary;
	}
	else if (unit >= 100 && unit <200) {
		bonus =(float)0.15*salary;
	}
	else if (unit >= 200) {
		bonus =(float)0.2*salary;
	}
	return bonus;

	}
	public manager(int unit, int salary)
	{
		super(234,"sadaff");
		this.unit = unit;
		this.salary = salary;
	}
}