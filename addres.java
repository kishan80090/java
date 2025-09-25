public class addres extends youtest{
        int age;
        public addres(String name,int age){
          super(name);
          this.age=age;
        }
        public String toString(){
            return super.toString()+"Name = "+name+" age= "+age;
        }
    }