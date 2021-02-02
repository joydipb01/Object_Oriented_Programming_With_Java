import java.util.*;

public class Main
{
	public static void wait(int ms){
	    try{
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex){
	        Thread.currentThread().interrupt();
	    }
	}
	
	public static void main(String[] args) {
		int sum=0, marks=0, i=1;
		String grade="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for your subjects. Enter -1 if you have entered marks for all your subjects");
		wait(4000);
		while(true){
		    System.out.print("Enter marks for subject"+i+": ");
		    marks=sc.nextInt();
		    if(marks==-1)
		        break;
		    else if(marks>100||marks<-1){
		        System.out.println("Invalid entry!! Enter again.");
		        continue;
		    }
		    sum+=marks;
		    i++;
		}
		i--;
		float ave = (float)sum/(float)i;
		if(ave>=85)
		    grade="A+";
		else if(ave>=75)
		    grade="A";
		else if(ave>=65)
		    grade="B+";
		else if(ave>=55)
		    grade="B";
		else if(ave>=50)
		    grade="C";
		else if(ave>=40)
		    grade="F";
		else
		    grade="F";
		System.out.println("Your grade is "+grade);
	}
}
