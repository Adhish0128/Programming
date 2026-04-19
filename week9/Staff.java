class Staff extends Person{
    int workingHours;
    double ratePerHour;
    
    Staff(int id, String Name, double basicSalary, int wokingHours, double ratePerHour){
        super(id,Name,basicSalary);
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
    }
    double calculateSalary(){
        return workingHours*ratePerHour;
    }
    void displayInfo(){
        System.out.println("Staff   :"+Name);
        System.out.println("Hours   :"+workingHours);
        System.out.printf("Salary   :Rs %.2f%",Name);
        System.out.println();
    }
}