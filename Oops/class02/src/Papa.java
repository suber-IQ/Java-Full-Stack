

public class Papa {
    public static void main(String[] args) {
        Animal animal = new Animal();
        String s = animal.ranveer();
        System.out.println(s);
        String s1 = animal.rashmika();
        System.out.println(s1);
        System.out.println("-------------------------");
        animal.ranveer("rashmika");


        int res = animal.ranveer(10); //ctrl + alt + v
        System.out.println(res);
        int res1 = animal.ranveer(20,40);
        System.out.println(res1);
    }
}





