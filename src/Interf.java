public interface Interf {
    public int squareIt(int x);
}
class Test
{
    public static void main(String[] args){
        Interf x =n->n*n;
        System.out.println(x.squareIt(4));
    }
}
