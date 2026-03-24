class Nick {
    
    void display() {
        System.out.println("Nick is a parent class");
    }
}

class Sonic extends Nick {
    
    void display() {
        System.out.println("Sonic is a child class 1");
    }
}

class Nickloden extends Sonic
{
void display()
{
System.out.println("Nickloden is a child class 2");
}
}
class DinamicDispatch {
    public static void main(String[] args) {
      
       Nickloden obj = new Nickloden();
       Sonic obj = new Sonic();
     Sonic.display();+
     Nickloden.display();
    }
}