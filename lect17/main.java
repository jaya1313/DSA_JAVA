package lect17;

import java.util.ArrayList;
import java.util.ListIterator;
// replace all negative value in array by its absolute value.
// public class main {
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(-1);
//         list.add(4);
//         list.add(-7);
//         list.add(5);
//         //listIterator(it has has previous too,can be move in to both directions and also can modiefy the existing value.)
//         ListIterator<Integer> it=list.listIterator();
//         while(it.hasNext()){
//             Integer x=it.next();
//             if(x<0){
//                 x=x*-1;
//                 it.set(x);
//             }           
// }
// System.out.println(list);
//}
//}
    
   public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(10);
        ListIterator<Integer> it=list.listIterator();
        Integer target=14;
        while(it.hasNext()){
             Integer x=it.next();
            if(x==target){
                break;
            }
        }
            while(it.hasPrevious()){
                Integer y=it.previous();
                if(y<target){
                    it.remove();
                }
 }

System.out.println(list);
}
}

