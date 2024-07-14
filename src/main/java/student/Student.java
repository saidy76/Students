package student;
import java.util.Scanner;
public class Student {
  private static String university = "University of Liberal Arts";
    private static int totalstudents = 0;

   private int id;
   private String name;
    private String department;
    private double cgpa;

     public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        
        this.department = department;
        this.cgpa = cgpa;
        totalstudents++; 
    }
 public void display(){
        System.out.println("ID: " + id);
        
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        
        System.out.println();
    }

 
    public static void totalstudents(){
        System.out.println("Total Students: " + totalstudents);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        
         Student[] student = new Student[3];
          for(int i=0;i<3;i++){
              System.out.println("Enter details for Students "+(i+1)+":");
              
              System.out.println("enter name :");
              String name=sc.nextLine();
              
              System.out.println("Enter id :");
              int id =sc.nextInt();
              
              
              sc.nextLine();
              
              System.out.println("enter department :");
              String department =sc.nextLine();
              
              System.out.println(" enter CGPA:");
              double cgpa =sc.nextDouble();
              sc.nextLine();
              student [i]=new Student(id,name,department,cgpa);
          }
          
for (Student std:student){
    System.out.println("Students details :");
    std.display();
        
       }
    
 Student.totalstudents();
}
}

