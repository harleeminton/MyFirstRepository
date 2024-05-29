import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args)
    {
        Type type;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please choose type A or type B: ");

        String input = keyboard.nextLine();

        input = input.toUpperCase();


        if (input.equals("A"))
        {
            type = new A();
            type.inform();
        }
        else if (input.equals("B"))
        {
            type = new B();
            type.inform();
        }
        else
        {
            System.out.println("Input not accepted, please try again.");
            input = keyboard.nextLine();
            input = input.toUpperCase();
        }

        


    }    
}
