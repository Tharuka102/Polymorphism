class Country {
    void naming (){ }
}
class Srilanka extends Country{
    @Override
    void naming() {
        System.out.println("Sri Lanka");
    }
}
class india extends Country{
    @Override
    void naming() {
        System.out.println("India");
    }
}
class test2 {
    public static void main(String[] args) {
        Country c,c1;
        c = new Srilanka();
        c1 = new india();
        c.naming();
        c1.naming();
    }
}