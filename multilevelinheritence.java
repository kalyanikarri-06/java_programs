class Nick {
    
    Nick() {
        System.out.println("Nick is a parent class");
    }
}

class Sonic extends Nick {
    
    Sonic() {
        System.out.println("Sonic is a child class 1");
    }
}

class Nickloden extends Sonic
{
Nickloden()
{
System.out.println("Nickloden is a child class 2");
}
}
class multilevelinheritence {
    public static void main(String[] args) {
      
       Nickloden obj = new Nickloden();
    }
}