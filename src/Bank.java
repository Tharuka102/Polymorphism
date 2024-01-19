class Bank{
    void savingBalance(){

    }
}
class BOC extends Bank{
    void savingBalance(){
        System.out.println("500000"); }}
class pepelebank extends Bank {
    void savingBalance(){
        System.out.println("40000");
    }
}
class NSB extends Bank {
    void savingBalance(){
        System.out.println("20000");
    }
}
class test{
    public static void main(String[] args) {
        Bank b;
        b = new BOC(); b.savingBalance();
        b = new pepelebank(); b.savingBalance();
        b = new NSB(); b.savingBalance();



    }
}