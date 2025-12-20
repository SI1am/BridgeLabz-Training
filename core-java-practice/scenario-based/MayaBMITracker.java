package scenarioBased;

import java.util.Scanner ;
public class MayaBMITracker {

    public static void main(String[] args)
    {


       // input section
        Scanner sc = new Scanner(System.in) ;
        System.out.println("******MAYA'S BMI CALCULATORS******") ;
        
        System.out.println("ENTER YOUR HEIGHT IN METERS  : " );
        float height = sc.nextFloat();
        
        System.out.println("ENTER YOUR WEIGHT IN KILOGRAMS : ") ;
        float weight = sc.nextFloat() ;


        // BMI CALCULATE

        float bmi = weight / ( height * height) ;

        
        
        // print results based on BMI

        if(18.5f <= bmi && bmi <= 24.9f) {
            System.out.println("Category: Normal");
            
        }else if(bmi < 18.5f) {
            System.out.println("Category: Underweight");
            
        }else{
            System.out.println("Category: Overweight");
            
        }
    }
}