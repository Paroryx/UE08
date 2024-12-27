package social.company;

public class NonProfit extends Company{
    public NonProfit(String name){
        super(name);
    }

    @Override
    public double getMonthlyCost(){
        return super.getMonthlyCost()*0.2;
    }
    
}
