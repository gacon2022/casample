package domain.model;

public class Member implements Model {
    private int memberId;
    private String name;
    private String password;
    private boolean isAnonymous;
    private String description;


    public Member(int memberId, String name, String password, boolean isAnonymous, String description) {
        this.memberId = memberId;
        this.name = name;
        this.password = password;
        this.isAnonymous = isAnonymous;
        this.description = description;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
