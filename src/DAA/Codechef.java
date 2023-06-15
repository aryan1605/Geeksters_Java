package DAA;
public class Codechef {

    public int sum(int a,int b)
    {
        return (a+b);
    }
    public int sum(int a,int b,int c)
    {
        return (a+b+c);
    }
    public static void main(String[] args) {

        Codechef obj = new Codechef();
        System.out.println(obj.sum(10,20));
        System.out.println(obj.sum(10,20,30));
    }
}
