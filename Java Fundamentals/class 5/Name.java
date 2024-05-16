import java.util.Scanner;

class NamePrint{

  public static void main(String[] args){
      
     //input by user
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first Name");
	String fName = sc.next();
	System.out.println("Enter Second Name");
	String sName = sc.next();

	String fullName = fName + " " + sName;
	System.out.println("Full Name is : " + fullName);

 	

  }
}














