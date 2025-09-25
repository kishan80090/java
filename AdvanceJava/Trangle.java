package AdvanceJava;
public class Trangle {
    int a,b,c;
    public Trangle(int a,int b,int c){
       this.a=a;
        this.b=b;
        System.out.println(this);
        this.c=c;
        System.out.println(this);
    }
    public Trangle currentObject(){
        return this;
    }
    @Override
   public String toString(){
    return "Trangle = "+"{A= "+a+",B= "+b+",C= "+c+"}";
   }
    public static void main(String[] args) {
        Trangle t1=new Trangle(4, 5, 6);
        System.out.println(t1);
        Trangle x=t1.currentObject();
        x.a=5;
        x.b=7;
        x.c=9;
        System.out.println(t1);
        System.out.println(x);
        System.out.println(t1==x);
    }
}