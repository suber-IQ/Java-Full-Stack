public class Dad {
     public String plot(){
         return "200 gaj ka plot";
     }
}

class Khushi extends Dad{
    public void demo(){
        plot();
    }
}
public class Driver{
    public static void main(String[] args) {
        Khushi khushi = new Khushi();
        khushi.plot();
        khushi.demo();
    }
}