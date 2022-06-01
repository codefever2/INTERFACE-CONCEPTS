//simple interface concept
interface  interfacep1
{
    void m1();
}
class childclass implements interfacep1
{
    public void m1()
    {
        System.out.println("child class implements p1 interface");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        childclass c = new childclass();
        c.m1();
    }
}