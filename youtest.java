public class youtest {

      Person customer;
      String accoun_no;
      int balance;
      public youtest(Person customer,String account_no,int balance ){
        this.customer=customer;
        this.accoun_no=account_no;
        this.balance=balance;

      }
      public String toString (){
        String output=String.format("Account_no: %s, customer: (%s),balance=%s",accoun_no,customer,balance);
        return output;
      }

    public static void main(String[] args) {
        youtest y1=new youtest(new Person("Raman", "varanasi", "9559717200", 25), "859654745", 1000);
        System.out.println(y1);
    }
}