import java.util.ArrayList;
import java.util.Iterator;

public class Listint8 {
    public static void main(String[] args){
        ArrayList l=new ArrayList();
        for(int i=1;i<=10;i++){
            l.add(i);
        }
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            Integer I=(Integer)itr.next();
            System.out.println(I);
        }
    }
}
