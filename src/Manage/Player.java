package Manage;

import java.io.Serializable;

public class Player implements Serializable {
    private int id;
    private String name;
    private int age;
    private int identityCard;

    public Player() {}

    public Player(int id, String name, int age, int identityCard) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.identityCard = identityCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString(){
        return "Người chơi tên : " + name + "\n" +
                "- Tuổi : " + age + "\n" +
                "- Chứng minh nhân dân số " + identityCard + "\n";
    }
}
