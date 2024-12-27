package social;
import social.company.Company;
public class Advertisement extends Profile {
    private String slogan;
    private Company company;
    
    public Advertisement(String name, String slogan, Company company){
        super(name, 1);
        follow(company);
        this.slogan = slogan;
        this.company = company;
    }
    @Override
    public double getMonthlyCost() {
        return slogan.length()*1.5;
    }
    @Override
    public String getHandle() {
        return super.getHandle()+"_by_"+company.name;
    }
}