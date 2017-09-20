import company.manager;
import person.teacher;

class abc{
    public static void main(String[] args)
    {
        teacher obj = new teacher(10);
        manager obj2 = new manager(100,55026);

        float teacher_salary = obj.total_sal();
        float emp_bonus = obj2.b_onus();
        System.out.println(teacher_salary+ " "+ emp_bonus);

    }
}