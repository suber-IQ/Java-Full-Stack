public class A {
    String city;
}

class B extends A{
    String city;
    void print(){
        super.city = "mumbai";
        city = "delhi";
    }

}


public class Test4{
    public static void main(String[] args) {
        
    }
}