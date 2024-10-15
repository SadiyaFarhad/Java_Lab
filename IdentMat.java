import java.util.*;
class IdentMat
{
    public static void main(String arg[])
{
      int arr[][]=new int[3][3];
      int i,j;
      boolean flg=true;
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Elements of matrix");
     for(i=0;i<3;i++)
       for(j=0;j<3;j++)
          arr[i][j]=sc.nextInt();
    for(i=0;i<3;i++)
{
        for(j=0;j<3;j++)
          { 
                if((i==j && arr[i][j]==1) || (i!=j && arr[i][j]==0) )
                 {
                          continue;
                   }
               else
                flg=false;
           }
           
}
   if(flg==true)
      System.out.println("Identity Matrix");
   else
System.out.println("Not Identitiy Matrix");
}
}


