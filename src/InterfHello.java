public interface InterfHello {
    public void m1();
}
class Test2{
    public static void main(String[] args){
        InterfHello i =()->System.out.println("Hello");
        i.m1();
    }
}