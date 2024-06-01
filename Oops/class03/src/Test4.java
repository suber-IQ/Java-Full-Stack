class Animal {
    String name;
}

class Dog extends Animal{
    String name;
    void print(){
        super.name = "Animal";
        name = "puppy";
        System.out.println("Animal  = " + super.name + " ,Dog = " + this.name);
    }

}


public class Test4{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.print();
    }
}