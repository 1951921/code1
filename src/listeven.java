import java.util.ArrayList;
import java.util.Iterator;

public class listeven {
    public static void main(String[] args){
        ArrayList l=new ArrayList();
        for(int i=1;i<=10;i++){
            l.add(i);
        }
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            Integer I=(Integer)itr.next();
            if(I%2==0){
                System.out.println(I);
            }
            else{
                itr.remove();
            }
        }
    }
}
