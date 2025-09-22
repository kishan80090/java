public class function {
    public void write () {
int num=5;
int fac=1;
for(int i=1;i<=num;i++){
    fac=fac*i;
}
System.out.println("Fact : "+ num +" = "+fac);

    }
    public static void main(String[] args) {
     function f1=new function();
     f1.write();
    }
}
