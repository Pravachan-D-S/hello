class git{
    void main(String [] args){
        System.out.println("this is initial commit ");
        MAIN m=new MAIN();
        m.print1();
        b1 b=new b1();
        b.print2();
    }
}
class MAIN{
    void print1(){
        System.out.println("this is MAIN commit");
    }
}
class b1{
    void print2(){
        System.out.println("this is b1 commit");
    }
}