import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int i, j;
		String[] words=new String[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names of 10 classmates: ");
		for(i=0;i<10;i++){
		    words[i]=sc.nextLine();
		}
		for(i=0;i<9;i++){
		    for(j=i+1;j<10;j++){
		        if(words[i].compareTo(words[j])>0){
		            String temp=words[i];
		            words[i]=words[j];
		            words[j]=temp;
		        }
		    }
		}
		System.out.println("In alphabetical order: ");
		for(i=0;i<10;i++)
		    System.out.println(words[i]);
	}
}
