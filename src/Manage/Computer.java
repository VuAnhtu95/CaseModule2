package Manage;

import java.io.Serializable;
import java.util.List;

public class Computer implements Serializable {
    private int id;
    private int startTime;
    private int endTime;
    private List<Services> services;
    Player player;

    public Computer(){}

    public Computer(int id, int startTime, int endTime, List<Services> services, Player player) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.services = services;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    public String toStringServices(){
        String result = "";
        for (int i = 0; i < services.size(); i++) {
            result += " + Dịch vụ số " + services.get(i).getId() + "\n" +
                      " + Tên dịch vụ " + services.get(i).getNameServices() + "\n" +
                      " + Giá dịch vụ " + services.get(i).getPrices() + " đồng" + "\n";
        }
        return result;
    }
    @Override
    public String toString(){
        return "Máy tính số " + id + "\n" +
                "- " + player + "\n" +
                "- Thời gian bắt đầu : " + startTime + "h" + "\n" +
                "- Thời gian kết thúc : " + endTime + "h " + "\n" +
                "- Dịch vụ gọi thêm : " + "\n" + toStringServices() +
                "------Mời Bạn Ra Quầy Tính Tiền------"+ "\n";
    }
}