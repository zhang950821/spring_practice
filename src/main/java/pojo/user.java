package pojo;

import java.util.Date;

public class user {
    String ID;
    String password;
    String userName;
    String email;
    String phone;
    String question;
    String answer;
    Date createTime;
    Date updateTime;

    public user(String ID, String password, String userName, String email, String phone, String question, String answer, Date createTime, Date updateTime) {
        this.ID = ID;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
