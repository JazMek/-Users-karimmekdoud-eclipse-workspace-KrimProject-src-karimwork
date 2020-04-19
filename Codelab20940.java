
import java.util.Scanner;

public class exempleswitch {
    
	
	
	
	public static void main(String[] args) {
		
		 int yesCount=0;
		 int noCount=0;
		 int response=0;
		 
		Scanner stdin=new Scanner(System.in);
		
		input= stdin.nextInt();
		
	switch (input){
		case 1: yesCount= yesCount+1;
		System.out.println("YES WAS RECORDED");
		      break;
		case 2:yesCount= yesCount+1;
		System.out.println("YES WAS RECORDED");
		      break;
		case 3:noCount= noCount+1;
		System.out.println("NO WAS RECORDED");
		      break;
		case 4:noCount= noCount+1;
		System.out.println("NO WAS RECORDED");
		      break;
	default:   System.out.println("INVALID");
		}
	}