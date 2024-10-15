
class Student
 {   String name,city;
     int age;
     Scanner sc=new Scanner(System.in);  
    void ReadData()
  {   System.out.println("Enter the Name of the student");
      name=sc.next();
      System.out.println("Enter the Age of the student");
      age=sc.nextInt();
      System.out.println("Enter the City of the student");
      city=sc.next();
 }

void PrintData()
{
       System.out.println(" Name of the student is \t"+name);
       System.out.println("Age of the student\t"+ age);
       System.out.println("City of the student\t"+city);
 }
}
class StudentTest
{     public static void main(String arg[])
{
      Scanner sc=new Scanner(System.in);
      int n;
     System.out.println("Enter th no of students");
     n=sc.nextInt();
     Student s[]=new Student[n]; // Creating Reference Object
       for(int j=0;j<n;j++)
     {    s[j]=new Student();  /// Intializing each Object created
          System.out.println("Details of  "+(j+1)+"Student");
            s[j].ReadData();
       }  
      for(int i=0;i<n;i++)
      {       System.out.println("Details of  "+(i+1)+"Student");
               s[i].PrintData();
      }
}  
}


