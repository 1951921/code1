public interface Interfadd {
    public void add(int a, int b);
}
class Test1{
    public static void main(String[] args){
        Interfadd i=(a,b)->System.out.println("the sum:"+(a+b));
        i.add(10,20);
    }
}