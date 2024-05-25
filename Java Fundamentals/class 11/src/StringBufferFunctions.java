public class StringBufferFunctions {
    public static void main(String[] args) {
        // append()
        StringBuffer sb = new StringBuffer("Anjali");
        sb.append("gupta");
        System.out.println(sb);

        // insert()
        //sb.insert(2,1234);
        //System.out.println(sb);

        // reverse()
        // sb.reverse();
        // System.out.println(sb);

        // replace()
        sb.replace(4,8,"hello");
        System.out.println(sb);

         //capacity()
        //StringBuffer sb1= new StringBuffer(); //output: 16 (default capcity)
        StringBuffer sb1 = new StringBuffer("Hello"); //output: 21 (default capcity 16 + 5(letter of hello) = 21)
        System.out.println(sb1.capacity());  //output: 16 (default capcity)



    }
}
