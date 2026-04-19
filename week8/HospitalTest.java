class Patient{
    String patientName;
    int age;
    int admittedDays;
    double dailyCharge;
    Patient(String patientName,int age,int admittedDays,double dailyCharge){
        this.patientName=patientName;
        this.age=age;
        this.admittedDays=admittedDays;
        this.dailyCharge=dailyCharge;
        
    }
    double calculateBill(){
        double total=admittedDays*dailyCharge;
        if(admittedDays>7){
            total=total-(total*0.10);
        }
        return total;
    }
    void displayInfo(){
        System.out.println("Name  :"+patientName);
        System.out.println("Age  :"+age);
        System.out.println("Days  :"+admittedDays);
        System.out.printf("Bill :RS %2f%n",calculateBill());
    }
}
public class HospitalTest{
    public static void main(String[] args){
        Patient p1= new Patient("Rohan Dhungel",19,5,2000);
        Patient p2= new Patient("Pratik Panta",23,7,6000);
        System.out.println("Patient1");
        p1.displayInfo();
        System.out.println("Patient2");
        p2.displayInfo();
        
    }
}