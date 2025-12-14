package lect17;
// iterator in array  (baed on indexing)
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.ListIterator;

public class hello {
     public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
       list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //listIterator(it has has previous too,can be move in to both directions and also can modiefy the existing value.)
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer x=it.next();
            System.out.println(x);
            if(x==4){
                //it.add(10);  // add after that value.
                it.set(10);  // replace its value at that element
            }
        }
        System.out.println(list);
        // while (it.hasPrevious()) {
        //     Integer y=it.previous();
        //     System.out.println(y);
        // }

    
    //iterator
        // Iterator<Integer> it=list.iterator();
        // while (it.hasNext()) {
        //    Integer x=it.next();
        //     System.out.println(x);
        //     if(x==4){
        //         it.remove();
        //     }
        // }
        // System.out.println(list);
     }
}
