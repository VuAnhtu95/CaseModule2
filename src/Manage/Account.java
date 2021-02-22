package Manage;

import java.io.Serializable;

public class Account implements Serializable {
    private String passWord;
    private String id;

    public Account(String passWord, String id) {
        this.passWord = passWord;
        this.id = id;
    }

    public Account() {
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "passWord='" + passWord + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
