package Method;
import Manage.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodsPlayer {
    static ArrayList<Player> players = new ArrayList<>();
    final String PATH = "C:\\Users\\TTC\\Desktop\\CaseStudy\\CaseStudy2\\src\\Player.dat";
    Scanner scanner = new Scanner(System.in);
    public MethodsPlayer(){
        players = (ArrayList<Player>) ReadAndWrite.readFromFile(PATH);
    }
    public  Player getPlayerByName(String name){
        Player a = null;
        for (Player i: players) {
            if (i.getName().equals(name)){
                a = i;
            }
        }
        return a;
    }

    public void add(Player player){
        players.add(player);
        ReadAndWrite.writeObjectToFile(players,PATH);
    }

    public void show(){
        for (Player a : players) {
            System.out.println(a.toString());
        }
    }
    public void update(String name){
        for (Player i : players) {
            if (i.getName().equals(name)){
                System.out.println("Nhập thông tin mới của người chơi này ");
                System.out.println("- Tuổi ?");
                int age = Integer.parseInt(scanner.nextLine());
                i.setAge(age);
                System.out.println("- Chứng minh nhân dân ?");
                int identity = Integer.parseInt(scanner.nextLine());
                i.setIdentityCard(identity);
            }
        }
    }

    public void delete(String name){
        players.removeIf(c -> c.getName().equals(name));
        ReadAndWrite.writeObjectToFile(players,PATH);
    }
}

