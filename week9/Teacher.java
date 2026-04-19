class Teacher extends Person {
    String subject;
    double bonus;
    Teacher(int id, String Name, double basicSalary, String subject,double bonus){
        super(id,Name,basicSalary);
        this.subject=subject;
        this.bonus=bonus;
    }
    @Override
    double calculateAnnualSalary(){
        return super.calculateAnnualSalary()+bonus;
    }
    void displayInfo(){
        System.out.println("Teacher   :"+ Name);
        System.out.println("Subject  :"+ subject);
        System.out.printf("Annual Salary: RS %.2f%n",calculateAnnualSalary());
    }
}