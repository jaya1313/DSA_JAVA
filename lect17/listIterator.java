package lect17;

import java.util.ArrayList;
import java.util.ListIterator;

// replace all odd numbers by -1.

// public class listIterator {
//      public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//        list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         ListIterator<Integer> it=list.listIterator();
//         while(it.hasNext()){
//            Integer x=it.next();
//             if(x%2!=0){
//                 it.set(-1);
//             }
//         }
//         System.out.println(list);
// }
// }

// move to mid of list and print elements and go back in reverse operation.
public class listIterator {
     public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int end =list.size();
        int mid=end/2;
        ListIterator<Integer> it=list.listIterator();// inbuilt function
            
         while(it.hasNext() && it.nextIndex()<=mid){
             
             Integer x=it.next();
             System.out.println(x);
        }
        while (it.hasPrevious()) {   // where next  ends previous loop starts
            Integer y=it.previous();
            System.out.println(y);
            
        }
    }
}
