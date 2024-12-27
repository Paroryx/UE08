package social.company;
import social.Profile;

public class Company extends Profile{
    public Company(String name){
        super(name, 10);
    }
    @Override
    public double getMonthlyCost() {
        return 10+2.5*this.getCurrentFollowingCount();
    }
}
