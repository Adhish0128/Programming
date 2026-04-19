public class SchoolApp{
    public static void main(String[] args){
        Teacher T= new Teacher(1,"Sampada Dahal",100000,"Accounts",10000);
        Staff S= new Staff(2,"Praveen kumar",30000,160,100);
        System.out.println("College:"+Person.CollegeName);
        System.out.println("Teacher Details");
        T.displayInfo();
        System.out.println("Staff Details");
        S.displayInfo();
        
    }
}