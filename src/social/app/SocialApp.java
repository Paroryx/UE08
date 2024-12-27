package social.app;

import io.Out;
import social.Advertisement;
import social.User;
import social.company.Company;
import social.company.NonProfit;

public class SocialApp {
  public static void main(String[] args) {
    Company hm = new Company("H&M");
    Company apple = new Company("Apple");
    Company amazon = new Company("Amazon");
    Company microsoft = new Company("Microsoft");
    Company google = new Company("Google");
    Company alphabet = new Company("Alphabet");
    alphabet.follow(google);

    NonProfit greenpeace = new NonProfit("Greenpeace");
    greenpeace.follow(hm);
    apple.follow(greenpeace);
    microsoft.follow(greenpeace);
    google.follow(greenpeace);
    
    NonProfit dwb = new NonProfit("Doctors Without Borders");
    greenpeace.follow(dwb);
    dwb.follow(greenpeace);

    Advertisement a1 = new Advertisement("think_different", "Think different!", apple);
    Advertisement a2 = new Advertisement("win11", "Brings you closer to what you love", microsoft);
    Advertisement a3 = new Advertisement("traditional slogan", "Books & more", amazon);

    // TODO: Create one user profile for yourself and follow at least one company, one NonProfit, and one advertisement.
    // Then, try to follow the already followed company a second time and make sure that it correctly returns false.
    User user1 = new User("Paroryx");
    user1.follow(apple);
    user1.follow(greenpeace);
    user1.follow(a3);
    Out.println("try to follow company again: "+user1.follow(apple));
    
    // Preparation for a more clean screenshot
    hm = null;
    apple = null;
    amazon = null;
    microsoft = null;
    google = null;
    alphabet = null;
    greenpeace = null;
    dwb = null;
    a1 = null;
    a2 = null;
    a3 = null;

    // TODO: Now iterate over all your followed profiles and print their handles to the console.
    for (int i = 0; i < user1.getCurrentFollowingCount(); i++) {
      String handle = user1.getFollowedProfileAtIndex(i).getHandle();
      Out.println("monthly cost of "+handle+" "+user1.getFollowedProfileAtIndex(i).getMonthlyCost()+" Euro");
    }
    // TODO: Take a screenshot of JavaWiz' heap visualization here
  }
}
