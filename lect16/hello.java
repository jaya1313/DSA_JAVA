package lect16;

import java.util.HashSet;

//set
//hashset - cannot store duplicate value
// public class hello {
//          public static void main(String[] args) {
//             HashSet<Integer> set=new HashSet<>();
//             set.add(5);
//             set.add(6);
//             set.add(2);
//             set.add(8);
//             System.out.println(set);
//          }   
// }

// find wheather it contains duplicate value or not
// public class hello {
//          public static void main(String[] args) {
//             int arr[]={1,2,3,4,2};
//             HashSet<Integer> set=new HashSet<>();
//             for(int x: arr){
//                 set.add(x);
//             }
//             if(arr.length == set.size()){
//                 System.out.println(true);
//             }
//             else{
//                 System.out.println(false);
//             }
            
//          }   
//}


// print the common elements between 2 elements
// public class hello {
//          public static void main(String[] args) {
//             int arr1[]={1,2,4,5,6,8,9};
//             int arr2[]={1,2,4,9,3};
//             HashSet<Integer> set=new HashSet<>();
//             for(int x: arr1){
//                 set.add(x);
//             }
//             HashSet<Integer> result=new HashSet<>();
//             for(int y: arr2){
//                 if(set.contains(y)){
//                     result.add(y);
//                 }
//             }
//           System.out.println(result);

            
        // } 
//}

// remove a element from set
public class hello {
         public static void main(String[] args) {
            HashSet<Integer> set=new HashSet<>();
            set.add(5);
            set.add(23);
            set.add(2);
            set.add(8);
            set.remove(5);
            System.out.println(set);
         }   
}