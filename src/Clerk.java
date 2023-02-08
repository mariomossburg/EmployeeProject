public class Clerk extends Employee{

    //public Clerk(){}
    public Clerk(String employeeID, String name, String department,
                 double salary, String designation){
        super(employeeID,name,department,
                salary,designation);
        addBonus();
    }
    @Override
    public double addBonus(){

        setBonus(100);
        return getBonus()+ getSalary();
    }
}
