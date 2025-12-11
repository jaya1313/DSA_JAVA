package lect12;
// encapsulation 1st program

class Atm{
    private int TotalBalance=10000;
    public void getB(){
        System.out.println(TotalBalance);
    }
    public void setBalance(int amount){
        if(amount>0){
            TotalBalance+=amount;
        }
       System.out.println(TotalBalance);

    }
}
public class main {
    public static void main(String[] args) {
        Atm a1=new Atm();
        a1.getB();
        a1.setBalance(2000);
    }
}
