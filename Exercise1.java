import java.util.*;
 class Exercise1 
{
 public static void main(String[] args)
    {
        int a,b,rem,qot; 
        Scanner r = new Scanner(System.in); 
        System.out.println("Enter  two number ");
        a=r.nextInt(); // Reading input 
        b=r.nextInt(); // Reading input 

        qot=a/b;   
         rem=a-(qot*b); 
         System.out.println("Reminder is\t"+rem);
   }
} 
   
