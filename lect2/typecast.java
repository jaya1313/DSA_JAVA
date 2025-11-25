// type casting
class typecast{
    public static void main(String[] args) {
        byte a=30;     //1 byte
        short b=a;      // 2byte
        System.out.println(b);//automatic type casting,we can fill the bigger data type by smaller data type.

        short c=130;
        byte d=(byte)c; // forcefully type casting
        System.out.println(d); //-126

    }
}