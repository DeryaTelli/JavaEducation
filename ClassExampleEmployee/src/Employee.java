public class Employee {
    private String name;
    public double salary ;
    private int workHour;
    private int hireYear;

    Employee(String name , double salary, int workHour , int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHour=workHour;
        this.hireYear=hireYear;
    }

    public double tax(){
        if(this.salary<=1000){
            return 0;
        }else{
            return this.salary*0.03;
        }
    }
    public double bonus(){
        int extraHours=this.workHour-40;
        if(extraHours>0)
        return 30*extraHours;
        else
         return 0;
    }
    public double raiseSalary(){
       int year= 2020-this.hireYear;
        if(year < 10){
            return (this.salary*0.05);
        } else if (year <20 && year>9 ) {
            return (this.salary*0.10);
        } else{
            return (this.salary*0.15);
        }

    }
    public void toString(Employee emp){
        System.out.println("Tax:"+emp.tax()+"\nBonus:"+emp.bonus()+"\nRaise Salar:"+emp.raiseSalary());
        double totalSalary = (emp.salary-emp.tax())+emp.raiseSalary()+emp.bonus();
        System.out.println("Current Salary: "+totalSalary);

    }

}

