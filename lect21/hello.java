package lect21;

import java.util.ArrayList;
import java.util.List;

// steam API
public class hello {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        List<Integer> res=list.stream().filter(n-> n%2!=0).toList();
        List<Integer> mapData=list.stream().map(n-> n*2).toList();
        int  data=list.stream().reduce(0,(a,b)->a+b);
        List<Integer> sk=list.stream().skip(3).toList();
        List<Integer> li=list.stream().limit(3).toList();
        List<Integer> sorted=list.stream().sorted((a,b)->a-b).toList();

        System.out.println(res);
        System.out.println(mapData);
        System.out.println(data);
        System.out.println(sk);
        System.out.println(li);
        System.out.println(sorted);
    }
    
}
