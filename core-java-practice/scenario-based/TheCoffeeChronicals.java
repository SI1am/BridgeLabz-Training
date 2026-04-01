// package scenarioBased;


import java.util.Scanner ;

public class TheCoffeeChronicals {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in) ;
        int totalAmount  = 0 ;
        System.out.println("****WELCOME TO THE COFFEE CHRONICALS****");
        System.out.println() ;
        while(true){
            System.out.println("YOUR CURRENT TOTAL BILL IS (without taxes) : " + totalAmount) ;

            System.out.println("ENTER THE COFFEE TYPE AS NUMBER  :\n 1. Cold Coffee - Rs. 100  \n 2. Hot Coffee - Rs. 200 \n 3. Black Coffee - Rs. 300 \n 4. exit");

            int userResponse = sc.nextInt() ;
            if(userResponse == 4 )break ;

            System.out.println("Number of Coffee : ") ;

            int quantity = sc.nextInt() ;
            switch (userResponse) {
                case 1:
                    totalAmount += 100 * quantity;
                    break;

                case 2:
                    totalAmount += 200 * quantity;
                    break;

                case 3:
                    totalAmount += 300 * quantity;
                    break;
                case 4:

                	System.out.println("*****Thankyou For Visiting Our Coffee Chronicals*****");
                	break;

                default:
                    System.out.println("Please enter valid input");
            }


        }

        float taxes = totalAmount * 0.08f ;
        System.out.println("******YOUR TOTAL AMOUNT IS : "  +  ( totalAmount  + taxes ) +"******") ;



    }
}