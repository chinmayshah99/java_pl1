package person;

class manager extends employee{
	float salary;
	int unit;
	float bonus;
	float b_onus()
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
	manager(int unit, int salary)
	{
		super(234,"sadf");
		this.unit = unit;
		this.salary = salary;
	}
}