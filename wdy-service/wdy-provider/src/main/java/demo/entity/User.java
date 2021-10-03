package demo.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String uname;

    private String upassword;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }

    public User(String uname, String upassword) {
        this.uname = uname;
        this.upassword = upassword;
    }
}
