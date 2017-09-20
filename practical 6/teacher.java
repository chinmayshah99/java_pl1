package person;
public class teacher extends employee {
	int nol; // no of lectures
	float salary;

	public float total_sal()
	{
		return salary*nol;
	}
	public teacher(int lec)
	{
		super(10,"sdf")	;
		nol = lec;
	}
}