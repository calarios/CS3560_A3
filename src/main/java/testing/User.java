package testing;

import java.util.ArrayList;
import java.util.List;

class User {
    private String userId;
    private List<String> followers;
    private List<String> followings;
    private List<String> newsFeed;

    public User(String userId) {
        this.userId = userId;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
        this.newsFeed = new ArrayList<>();
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public List<String> getFollowers() {
        return followers;
    }

    public List<String> getFollowings() {
        return followings;
    }

    public List<String> getNewsFeed() {
        return newsFeed;
    }
}
