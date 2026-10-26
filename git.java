class git{
    void main(String [] args){
        System.out.println("this is initial commit ");
        MAIN m=new MAIN();
        m.print1();
        b1 b=new b1();
        b.print2();
        b2 b=new b2();
        b.print3();
    }
}
class MAIN{
    void print1(){
        System.out.println("this is MAIN commit");
    }
}
class b1{
    void print2(){
        System.out.println("this is b1 commit");}}
class b2{
    void print3(){
        System.out.println("this is b2 commit");
    }
}