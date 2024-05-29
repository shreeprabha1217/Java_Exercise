import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Random rand = new Random();
        int a = rand.nextInt(100) + 1;
		int chances=0;
		do {
		    System.out.println("Enter a number");
		    int b=sc.nextInt();
		    if(b==a){
		        System.out.println("Your guess is correct");
		        System.out.println("You guessed in "+chances);
		        break;
		    }
		    else if(b>a && b<100){
		        System.out.println("Your guess is large");     
		        
		    }
		    else if(b<a && b>0){
		        System.out.println("Your guess is small");
		    }
		    else
		        System.out.println("Enter valid number");
		    chances++;
		} while (chances<100);
	}
}
