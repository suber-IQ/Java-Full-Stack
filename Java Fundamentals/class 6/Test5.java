import java.util.Scanner;

class Test5{
 public static void main(String[] args){
	int i = 19;
	int j = 29;
	int z = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
 	

	System.out.println("z: " + z);
	
 }
}