import java.util.*;
class SortAlphabet
{    public static void main(String arg[]) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.println("How many Names do you want to enter?");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter "+n+"  names:");
        for(int i = 0; i < n; i++)        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) 
            {    if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }   }   }
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < n ; i++) 
                    System.out.print(names[i]+"\n" );
         } 
 }

