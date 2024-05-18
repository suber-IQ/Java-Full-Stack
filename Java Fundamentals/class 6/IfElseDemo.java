import java.util.Scanner;

class IfElseDemo{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter the second number: ");
	int n2 = sc.nextInt();

	//if-else
	if(n1+n2 == 20){
	    System.out.println("NH24: ");
	}
	else{
            System.out.println("NH12: ");
        }
	System.out.println("Go to Delhi: ");

 }
}