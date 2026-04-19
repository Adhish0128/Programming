import java.util.Scanner;
public class ScholarshipChecker{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your GPA");
        double gpa=sc.nextDouble();
        System.out.print("Enter your attendance percentage");
        double attendance=sc.nextDouble();
        
        if(gpa < 0.0|| gpa > 4.0){
            System.out.println("Invalid GPA");
            
        } else if(attendance<0||attendance>100){
            System.out.println("Invalid attendance");
            
        }else if(gpa>=3.7&& attendance>=90){
            System.out.println("Full Scholorship granted");
        }else if(gpa>=3.3&& attendance>=90){
            System.out.println("Partial Scholorship granted(75%)");
        }else if(gpa>=3.0&& attendance>=80){
            System.out.println("Partial Scholorship granted(50%)");
        }
        else {
            System.out.println("Scholarship not granted");
        }
        
    }
}