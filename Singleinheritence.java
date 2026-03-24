class Nick {
    
    Nick() {
        System.out.println("Nick is a parent class");
    }
}

class Sonic extends Nick {
    
    Sonic() {
        System.out.println("Sonic is a child class");
    }
}

class Singleinheritence {
    public static void main(String[] args) {
      
        Sonic obj = new Sonic();
    }
}