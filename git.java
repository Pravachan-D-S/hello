class git{
    void main(String [] args){
        System.out.println("this is initial commit ");
        MAIN m=new MAIN();
        m.print1();
        b2 b=new b2();
        b.print3();
    }
}
class MAIN{
    void print1(){
        System.out.println("this is MAIN commit");
    }
}
class b2{
    void print3(){
        System.out.println("this is b2 commit");
    }
}