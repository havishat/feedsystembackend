package feed.enums;

public enum UserRole {
    ADMIN_ROLE("admin_role"),
    USER_ROLE("user_role");

    private String userType;

    UserRole(String userType){
        this.userType = userType;
    }

    public String getUserType(){
        return this.userType;
    }
}
