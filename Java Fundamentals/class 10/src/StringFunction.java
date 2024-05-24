public class StringFunction {
    public static void main(String[] args) {
        // Concatention
        String s1 = "Sumit";
        String s2 = " kumar";
        String s3 = s1 + s2;
        System.out.println(s3);

        // toCharArray();
        String s4= "Priyanka";
        char arr[] = s4.toCharArray();
        System.out.println(arr);
        // System.out.println(Arrays.toString(arr));

        //charAt()
        String s5 = "Amit";
        System.out.println(s5.charAt(1));

        //compareTo()
        String s6 = "hello";
        String s7 = "hello";
        int res = s6.compareTo(s7);
        System.out.println(res); // output: 0

        // reference com equals()
        System.out.println(s6.equals(s7)); // output: true

        //contains()
        String s8 = "Hello sumit welcome to the development";
        // System.out.println(s8.contains("welcome")); //output: true
        System.out.println(false); //output: false

        // indexOf()
        System.out.println(s8.indexOf('s')); //output: 6

        // replace()
        String s9 = "Hello world";
         String res1 = s9.replace("world","Sumit");
        System.out.println(res1); // output: Hello Sumit

        // subString()

        String s10 = "Hello sumit welcome to the development";
        String res2 = s10.substring(0,7);
        String res3 = s10.substring(12);
        System.out.println(res2);
        System.out.println(res3);


    }
}
