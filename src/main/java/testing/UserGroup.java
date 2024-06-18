package testing;

import java.util.ArrayList;
import java.util.List;


class UserGroup {
    private String groupId;
    private List<Object> members;

    public UserGroup(String groupId) {
        this.groupId = groupId;
        this.members = new ArrayList<>();
    }

    // Getters and Setters
    public String getGroupId() {
        return groupId;
    }

    public List<Object> getMembers() {
        return members;
    }
}