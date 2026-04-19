class Person{
    int id;
    String Name;
    static String CollegeName="Itahari International College";
    double basicSalary;
    
    Person(int id, String name, double basicSalry){
        this.id=id;
        this.Name=Name;
        this.basicSalary=basicSalary;
        
    }
    double calculateAnnualSalary(){
        return basicSalary*12;
    }
}