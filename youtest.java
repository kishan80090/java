public class youtest {
int a,b,c;
public youtest(int a,int b,int c){
    this.a=a;
    this.b=b;
    this.c=c;
    System.out.println(this);
}
public youtest currentobject(){
    return this;
}
@Override
public String toString(){
return "Trangle = {"+"a= "+a+",b= "+b+",c= "+c+"}";
} 
    public static void main(String[] args) {
        youtest y1=new youtest(1, 2, 3);
        System.out.println(y1);
        youtest x=y1.currentobject();
        x.a=2;
        x.b=3;
        System.out.println(y1);
        System.out.println(x);
        System.out.println(y1==x);
        
    }
}