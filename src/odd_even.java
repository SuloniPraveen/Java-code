import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        if(n%2==0)
        {
            if(n>=2 && n<=5)
                System.out.println("Not weird");
            else if (n>=6 && n<=20)
                System.out.println("Not weird");
            else if (n>20)
                System.out.println("Not weird");
        }
        else
            System.out.println("weird");
    }
}
