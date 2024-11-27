import java.util.Scanner;
public class Quize{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("WELCOME TO THE QUIZE GAME!");
System.out.print("Press Enter for Next");
sc.nextLine();
System.out.println("Rule:You Have 5 question. For every correct ans,your score is increase 5, for every wrong ans 1 will decrease from Score.After Each Question you can see your current score , after 5 question, you will find your final score");
System.out.print("Press Enter for Next");
sc.nextLine();

int score =0,from=0;

System.out.println("YOUR QUIZE IS STARTING");
System.out.println("1. What is the capital of BAngladesh?");
System.out.println("A.Dhaka		B.Tangail	C.Chittagong");
String ans=sc.nextLine();
if(ans.equals("A")){
  System.out.println("Correct!");
     score+=5;
     from+=5;
}
else
{
System.out.println("Wrong! Correct is A.Dhaka");
    score-=1;
    from+=5;
}
if(score<=0)
System.out.println("Your Current Score is : 0");
else
System.out.println("Your Current Score is : "+score+"/"+from);

System.out.print("Press Enter for Next Question.");
sc.nextLine();

System.out.println("2.What is the national flower of Bangladesh?");
System.out.println("A.Rose		B.Water Lily	C.Sunflower");
String ans2=sc.nextLine();
if(ans2.equals("B")){
  System.out.println("Correct!");
     score+=5;
     from+=5;

}
else
{
System.out.println("Wrong! Correct is B.Water Lily");
    score-=1;
    from+=5;

}
if(score<=0)
System.out.println("Your Current Score is : 0");
else
System.out.println("Your Current Score is : "+score+"/"+from);
System.out.print("Press Enter for Next Question.");
sc.nextLine();

System.out.println("3.In which year did Bangladesh gain independence?");
System.out.println("A.1952		B.1969		C.1971");
String ans3=sc.nextLine();
if(ans3.equals("C")){
  System.out.println("Correct!");
     score+=5;
    from+=5;

}
else
{
System.out.println("Wrong! Correct is C.1971");
    score-=1;
    from+=5;

}
if(score<=0)
System.out.println("Your Current Score is : 0");
else
System.out.println("Your Current Score is : "+score+"/"+from);
System.out.print("Press Enter for Next Question.");
sc.nextLine();


System.out.println("4.What is the currency of Bangladesh?");
System.out.println("A.Rupee		B.Doller		C.Taka");
String ans4=sc.nextLine();
if(ans4.equals("C")){
  System.out.println("Correct!");
     score+=5;
     from+=5;

}
else
{
System.out.println("Wrong! Correct is C.Taka");
    score-=1;
    from+=5;

}
if(score<=0)
System.out.println("Your Current Score is : 0");
else
System.out.println("Your Current Score is : "+score+"/"+from);
System.out.print("Press Enter for Next Question.");
sc.nextLine();

System.out.println("5.What is the official language of Bangladesh?");
System.out.println("A.Hindi		B.Bangla	C.Urdu");
String ans5=sc.nextLine();
if(ans5.equals("B")){
  System.out.println("Correct!");
     score+=5;
   from+=5;

}
else
{
System.out.println("Wrong! Correct is B.Bangla");
    score-=1;
   from+=5;

}


if(score<=0)
System.out.println("Your Final Score is : 0");
else
System.out.println("Your Final Score is : "+score+"/"+from);
}

}