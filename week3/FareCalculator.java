import java.util.Scanner;
public class FareCalculator
{

    public static void main(String[] srgs)
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter distance travelled in KM: ");
         double distance = sc.nextDouble();
         System.out.print("Duration of travel: ");
         double time = sc.nextDouble();
         System.out.print("Are you local to this town??ENTER TRUE OR FALSE");
         boolean local = sc.nextBoolean();
         System.out.print("Are you travelling at night??ENTER TRUE OR FALSE");
         boolean day = sc.nextBoolean();
         boolean discount=local||day;
         
         
         if(local||day){
             double fare=((distance*20)-((distance*20)*(20/100)));
                   System.out.print(fare);
             
             
         }
         else{
             double fare=(distance*20);
             System.out.print(fare);
             
         }
         
         
         
         
         
         
         
        
         
         sc.close();
    }
}