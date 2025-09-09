
public class Result {
int rollno,physics,chemistry,maths;
String name;
public Result(int r,int p,int c,int m,String n){
    this.rollno=r;
    this.physics=p;
    this.chemistry=c;
    this.maths=m;
    this.name=n;
}
public String toString() {
    if (physics < 40 || maths < 40 || chemistry < 40)
        return String.format("Name: %s, Roll_No: %d, Physics: %d, Chemistry: %d, Maths: %d, Result: Fail",
        name, rollno, physics, chemistry, maths);
    else
        return String.format("Name: %s, Roll_No: %d, Physics: %d, Chemistry: %d, Maths: %d, Result: Pass",
                name, rollno, physics, chemistry, maths);
}
    public static void main(String[] args) {
        Result r1=new Result(101, 45, 75, 49, "Pappu");
        Result r2=new Result(101, 5, 75, 39, "Quattrochhi");
        System.out.println(r1);
        System.out.println(r2); 
    }
}