
interface  interfacepp1
{
    void m1();
}
interface interfacep2
{
    void m1();
//    void m2();
}
class childclass1 implements interfacepp1,interfacep2
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

public class twoparentsinterface
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        childclass1 c = new childclass1();
        c.m1();
    }
}
