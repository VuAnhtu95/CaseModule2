package Manage;

import java.io.Serializable;

public class Bill implements Serializable {
    private int id;
    private Player player;
    private int startTime;
    private int endTime;
    private int time;
    private double caculate;
    private double pricesServices;

    public Bill() {}

    public Bill(int id, Manage.Player player, int startTime, int endTime, int time, double caculate, double pricesServices) {
        this.id = id;
        this.player = player;
        this.startTime = startTime;
        this.endTime = endTime;
        this.time = time;
        this.caculate = caculate;
        this.pricesServices = pricesServices;
    }

    public double getTime() {
        return time;
    }

    public void setTime(int endTime, int startTime) {
        this.time = endTime - startTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public double getCaculate() {
        return caculate;
    }

    public void setCaculate(double time , double pricesServices) {
        this.caculate = time*3000 + pricesServices;
    }

    public double getPricesServices() {
        return pricesServices;
    }

    public void setPricesServices(double pricesServices) {
        this.pricesServices = pricesServices;
    }

    @Override
    public String toString(){
        return "Bill số " + id + "\n" +
                "- Người chơi " + player + "\n" +
                "- Thời gian bắt đầu : " + startTime + "h" + "\n" +
                "- Thời gian kết thúc : " + endTime + "h " + "\n" +
                "- Tổng thời gian chơi : " + time + "h " + "\n" +
                "- Số tiền phải thanh toán " + caculate + " đồng.";
    }
}

