package com.mvmt.project.p2.dto;

public class UserDto {

    private String userId;
    private String userPwd;
    private String userEmail;
    private String userName;
    private String userPhone;
    private String userAddr;
    
    public UserDto() { this("","",""); }
    public UserDto(String userId, String userPwd, String userEmail){
        this.userId = userId;
        this.userPwd = userPwd;
        this.userEmail = userEmail;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((userPwd == null) ? 0 : userPwd.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserDto other = (UserDto) obj;
        if (userEmail == null) {
            if (other.userEmail != null)
                return false;
        } else if (!userEmail.equals(other.userEmail))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        if (userPwd == null) {
            if (other.userPwd != null)
                return false;
        } else if (!userPwd.equals(other.userPwd))
            return false;
        return true;
    }
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserAddr() {
        return userAddr;
    }
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }
    
    @Override
    public String toString() {
        return "UserDto [userId=" + userId + ", userPwd=" + userPwd + ", userEmail=" + userEmail + ", userName="
                + userName + ", userPhone=" + userPhone + ", userAddr=" + userAddr + "]";
    }
    
}
