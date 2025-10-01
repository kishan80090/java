public class Dhesus {
    private int quantity;
    public Dhesus(int quantity){
        this.quantity=quantity;
    }
    public double tax(){
        if(quantity<=10)
        return 0;
        if(quantity<=50)
        return (quantity-10)*0.5;
        return 40*0.50+(quantity-50)*0.75;
    }
}
