import java.util.Scanner;

class NestedIfElse{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	
	//if-else
	if(n > 50){
	    System.out.println("Given Number is greater then 50");
		if(n%2 == 0){
		   System.out.println("Number is dev by 2");
		}else{
		  System.out.println("Number is not div by 2");
		}
	}else{
            System.out.println("number is less then 50");
        }
	
 }
}