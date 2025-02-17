Question 1:
public class ArrayReverse {
    public static void reverse(float[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            float temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        float[] arr = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};
        reverse(arr);

        // Print reversed array
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
Input: 5.8 2.6 9.0 3.4 7.1
Output: 7.1 3.4 9.0 2.6 5.8

Question 3:

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

Input: 
Student ID: it23050
No. of Courses: 3
Enter Information For Course 1
Credit (Max 3): 3
CT (Max 30): 25
AT (Max 10): 8
FE (Max 60): 55
Enter Information For Course 2
Credit (Max 3): 3
CT (Max 30): 22
AT (Max 10): 10
FE (Max 60): 60
Enter Information For Course 3
Credit (Max 3): 3
CT (Max 30): 23
AT (Max 10): 11
FE (Max 60): 22

Output:
Student ID:  it23050
Credit Taken: 9.0
Credit Earned: 9.0
CGPA: 3.58
Grade: A-


