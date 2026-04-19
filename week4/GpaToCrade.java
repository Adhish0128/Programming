import java.util.Scanner;
public class GpaToCrade{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your GPA:");
        double gpa=scanner.nextDouble();
        if(gpa < 0.0||gpa > 4.0){
            System.out.println("Invalid GPA");
        } else if(gpa >= 3.7){
            System.out.println("Grade:A+");
        } else if(gpa >= 3.3){
            System.out.println("Grade:A");
        } else if(gpa >= 3.0){
            System.out.println("Grade:A-");
        }else if(gpa >= 2.7){
            System.out.println("Grade:B+");
        }else if(gpa >= 2.3){
            System.out.println("Grade:B");
        }else if(gpa >= 2.0){
            System.out.println("Grade:B-");
        }else if(gpa >= 1.0){
            System.out.println("Grade:F");
        }
            

        scanner.close();
    }
}
