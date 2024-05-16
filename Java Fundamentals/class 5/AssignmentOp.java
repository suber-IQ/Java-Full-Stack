class AssignOp{

  public static void main(String[] args){
	
	int a = 10;
	int b = 20;
	int c = 0;

	c = a + b;
	System.out.println(c); //output: 30

	c += a; // c=c+a;
	System.out.println(c); // output: 40

	c -= a; // c = c-a;
	System.out.println(c);  //output: 30

	c *= a; // c = c*a;
	System.out.println(c);  //output: 300

	c /= a; // c = c/a;
	System.out.println(c);  //output: 30

	c %= a; // c = c%a;
	System.out.println(c);  //output: 0

		

  }
}


