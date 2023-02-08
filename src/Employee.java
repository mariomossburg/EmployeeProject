public class Employee {

    private String employeeID;
//    private double hours;
    private double salary;
    private double bonus = 200.0;
    private String name;
    private String department;
    private String designation;




    public Employee() {
    }

    public Employee(String employeeID, String name, String department,
                    double salary, String designation) {

        setEmployeeID(employeeID);
        setName(name);
        setDepartment(department);
        setSalary(salary);
        setDesignation(designation);
        addBonus();

    }


//    public double salaryCalculator() {
//        return salary / hours;
//    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

//    public void setHours(double hours) {
//        this.hours = hours;
//    }
//
//    public double getHours() {
//        return hours;
//    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public double addBonus() {
        return bonus + getSalary();
    }

    public void display() {
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Employee name: " + getName());
        System.out.println("Department Name: " + getDepartment());
        System.out.println("Salary: " + getSalary());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Salary after adding the bonus is: " + addBonus());
    }

    public void display2Header() {
        System.out.println("Employess ID \t Present \t Absent \t Deductions");
    }

    public int deductions(int daysPresent) {
        int daysAbsent = (20 - daysPresent);
        double deductions = ((addBonus() / 20) * daysAbsent);
        return (int) deductions;
    }

    public void display2(int daysPresent) {
        int daysAbsent = (20 - daysPresent);
        double deductions = ((addBonus() / 20) * daysAbsent);
        System.out.print(getEmployeeID() + "\t\t\t\t");
        System.out.print(daysPresent + "\t\t\t");
        System.out.print(daysAbsent + "\t\t\t");
        System.out.print(deductions + "\n");

    }

    public boolean equals(Employee otherEmp, Employee otheremp2) {
        return getDesignation().equalsIgnoreCase(otherEmp.getDesignation());
    }


}// end class
