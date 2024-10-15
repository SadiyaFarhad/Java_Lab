class Armstrong
{
   public static void main(String arg[])
  {
     int no=54748,rem,sum=0;        //370,371,1634,54748,548834,1741725,24678050,146511208
     int temp=no;
     int len = (int) (Math.log10(no) + 1);  
     while(no!=0)
     {
       rem=no%10;
       sum+=(Math.pow(rem,len));
       no=no/10;
     }
   System.out.println("\nOriginal num is  "+temp);
   System.out.println("Sum is  "+sum);
    if(sum==temp)
        System.out.println("Its an Armstrong number");
    else
        System.out.println("Not an Armstrong number");
}
}
  

