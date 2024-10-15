import java.util.*;
class Exercise2
{
    public static void main(String a[])
  {
     char ch='P';
     int i=ch;
     
     if(i>=65 && i<=90)
     {
     char c=(char)(i+32);
     System.out.println("Char in lower case " +c);
      }
     else if(i>=97 && i<=122)
     {
      char c=(char)(i-32);
      System.out.println("Char in upper case " +c);
     }
   }

} 

