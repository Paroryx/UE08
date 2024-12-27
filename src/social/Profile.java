package social;


public class Profile{

    protected final String name;
    private final Profile[] followedProfiles;

    public Profile(String name, int maxProfilesToFollow){
        this.name = name;
        this.followedProfiles = new Profile[maxProfilesToFollow];
    }

    public double getMonthlyCost(){
        return 0.00;
    }

    public String getHandle(){
        return '@'+name.replaceAll(" ", "_");
    }

    public int getCurrentFollowingCount(){
        for (int i = 0; i < followedProfiles.length; i++) {
            if(followedProfiles[i]==null)
                return i;
        }
        return followedProfiles.length;
    }

    public Profile getFollowedProfileAtIndex(int index){
        if(index < 0 || index >= followedProfiles.length || followedProfiles[index]==null){
            return null;
        }
        return followedProfiles[index];
    }

    public boolean isFollowing(Profile profile) {
        for (Profile fp : followedProfiles) {
            if(fp == null) return false;
            if (profile.equals(fp)) {
                return true;
            }
        }
        return false;
    }

    public boolean follow(Profile profile){
        if (isFollowing(profile) || getCurrentFollowingCount() >= followedProfiles.length) {
            return false;
        }
        for (int i = 0; i < followedProfiles.length; i++) {
            if (followedProfiles[i] == null) {
                followedProfiles[i] = profile;
                return true;
            }
        }
        return false;
    }
}
