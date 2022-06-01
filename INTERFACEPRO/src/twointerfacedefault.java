

interface  interfaceppp1
{
    void m1();
    default void dmethod()
    {
        System.out.println("default method ");
    }
}
interface interfacepp2
{
    void m1();
    default void dmethod1()
    {
        System.out.println("default method  1");
    }
//    void m2();
}
class childclass2 implements interfaceppp1,interfacepp2
{
    public void m1()
    {
        System.out.println("child class implements p1 interface");
    }
    public void m2()
    {
        System.out.println("child class implements m2 of p3 interface");
    }
}
public class twointerfacedefault
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        childclass2 c = new childclass2();
        c.m1();
        c.dmethod();
        c.dmethod1();

    }
}
