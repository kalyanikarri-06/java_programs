class StaticVariable{
    int rollno;
    String name;
     static String clgname="AUS";
    StaticVariable(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println("roll no:" +rollno+"name:"+name+"campus:"+clgname);
    }
    public static void main(String args[])
    {
        StaticVariable sv1=new StaticVariable(1,"kalyani");
        StaticVariable sv2=new StaticVariable(2,"sneha");
        sv1.display();
        sv2.display();
       // sv3.display();
    }
}