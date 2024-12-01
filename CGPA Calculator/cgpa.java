import java.util.Scanner;
public class cgpa{
 public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Student ID: ");
String id=sc.nextLine();
System.out.print("No. of Courses: ");
int course=sc.nextInt();
double take=0,earn=0,crgpa=0;
for(int i=0;i<course;i++)
{
double marks=0;
System.out.println("Enter Information For Course "+(i+1));   
System.out.print("Credit (Max 3): ");
  double n=sc.nextDouble();
take+=n;
System.out.print("CT (Max 30): ");
int m1=sc.nextInt();
marks+=m1;
System.out.print("AT (Max 10): ");
int m2=sc.nextInt();
marks+=m2;
System.out.print("FE (Max 60): ");
int m3=sc.nextInt();
marks+=m3;


double gpa;
if (marks >= 80) gpa= 4.00;
        else if (marks >= 75) gpa =3.75;
        else if (marks >= 70) gpa =3.50;
        else if (marks >= 65) gpa =3.25;
        else if (marks >= 60) gpa =3.00;
        else if (marks >= 55) gpa =2.75;
        else if (marks >= 50) gpa =2.50;
        else if (marks >= 45) gpa =2.25;
        else if (marks >= 40) gpa =2.00;
        else gpa = 0.00; 
if(marks>=40)
  earn+=n;
crgpa+=n*gpa;

}

double cgpa=crgpa/take;
String grade;

if (cgpa == 4.00) grade ="A+";
        else if (cgpa >= 3.75) grade ="A";
        else if (cgpa >= 3.50) grade ="A-";
        else if (cgpa >= 3.25) grade ="B";
        else if (cgpa >= 3.00) grade ="B-";
        else if (cgpa >= 2.75) grade ="C";
        else if (cgpa >= 2.50) grade ="C-";
        else if (cgpa >= 2.25) grade ="D";
        else if (cgpa >= 2.00) grade ="D-";
        else grade ="F";

System.out.println("Student ID:  "+id);
System.out.println("Credit Taken: "+take);
System.out.println("Credit Earned: "+earn);
System.out.println("CGPA: "+cgpa);
System.out.println("Grade: "+grade);

}
}