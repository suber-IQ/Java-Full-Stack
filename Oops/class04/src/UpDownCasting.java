

class Parent{
  void display(){
      System.out.println("This is the parent class");
  }

}

class Child extends Parent{
    void display(){
        System.out.println("This is the child class");

    }
}


public class UpDownCasting {


    public static void main(String[] args) {
            Parent p = new Parent();
            p.display();

            p = (Parent) new Child(); // upcasting
            p.display();

           Child c = (Child) p;  //downcasting
           c.display();



    }
}




