import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ArraylistIterator {
    public static void main(String[] args) {
        ArrayList al =new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();




        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Vector v = new Vector<>();
        for(int i=1;i<=10;i++){
            v.add(i);
        }
        v.add("v");
        Enumeration en=v.elements();
        while(en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");
        }



        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        LinkedList ll=new LinkedList<>();
        for(int i=1;i<=10;i++){
            ll.add(i);

        }
        System.out.println(ll);

        Iterator itr1=ll.iterator();
        while(itr1.hasNext()){
            Integer I=(Integer)itr1.next();
            System.out.print(I+" ");
        }

    }
}
