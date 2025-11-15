public class Main {
    public static void main(String[] args) {
        System.out.println("hello java");
        byte a = 15;
        System.out.println(a);
        short b = 20;
        System.out.println(b);
        int c = 50;
        System.out.println(c);
        float d = 1.9f;
        System.out.println(d);
        char e = 'n';
        System.out.println(e);
        boolean f = true;
        System.out.println(f);
        if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        // sum of digits
        int s = 123;
        int sum = 0;
        while (s > 0) {
            int rem = s % 10;
            sum = sum + rem;
            s = s / 10;
        }
        System.out.println(sum);

        //palindrome
//        int y = 121;
//        int z = 0;
//        for (int i = 0; i < 3; i++) {
//            int num = y % 10;
//            z = num;
//            y = y / 10;
//        }
//        if (y == z) {
//            System.out.println("palindrome");
//        } else {
//            System.out.println("not palindrome");
//        }

        //pattern
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //opposite

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>0;k--){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
            }

        }