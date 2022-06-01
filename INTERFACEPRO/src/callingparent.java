interface interf
{
//    int min = 5;
    int max = 15;
    void mm1();
    static void mm2()
    {
        System.out.println("static interface mm2() method");
    }
    default void csuper()
    {
        System.out.println("csuper method called");
    }
    default void test()
    {
        System.out.println("interface test method");
    }
//    static void test()
//    {
//        System.out.println("interface static test method");
//    }
}
class parent1
{
    int min = 10;
    final int max = 20;
    public void mm1()
    {
        System.out.println("parent class mm1() method");
    }
    public void test()
    {
        System.out.println("parent class test method");
    }
}
class child extends parent1 implements interf
{
    public void mm1()
    {
        super.mm1();
        System.out.println("child class mm1() method");
    }
}
public class callingparent
{
    public static void main(String[] args)
    {
        child c = new child();
        c.mm1();
        interf.mm2();
//        System.out.println(interf.min);
        System.out.println(interf.max);
        System.out.println(c.min);
        c.test();
        c.csuper();
    }
}
