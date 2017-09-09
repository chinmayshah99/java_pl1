package person;
class teacher extends employee {
	int nol; // no of lectures
	float salary;

	float total_sal()
	{
		return salary*nol;
	}
	teacher()
	{
	super(10,"sdf")	;
	}
}