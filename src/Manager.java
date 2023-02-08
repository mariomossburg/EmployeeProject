public class Manager extends Employee{


    //public Manager(){}

    public Manager(String employeeID, String name, String department,
                    double salary, String designation){

        super(employeeID,name,department,
                salary,designation);
        addBonus();
    }
    @Override
    public double addBonus(){
        setBonus(300);
        return getBonus() + getSalary();
    }

}
