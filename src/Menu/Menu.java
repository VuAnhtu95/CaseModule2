package Menu;

import Manage.Account;
import Manage.Bill;
import Manage.Computer;
import Manage.Player;
import Method.MethodsAccount;
import Method.MethodsComputer;
import Method.MethodsPlayer;
import Method.MethodsBill;
import java.util.Scanner;

public class Menu {
    static Methods methods = new Methods();
    static Scanner scanner = new Scanner(System.in);
    static MethodsBill methodsBill= new MethodsBill();
    static MethodsPlayer methodsPlayer = new MethodsPlayer();
    static MethodsComputer methodsComputer = new MethodsComputer();
    static MethodsAccount methodsAccount = new MethodsAccount();
    public static void main(String[] args) {
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ QUÁN GAME ONLINE");
            System.out.println("1: Đăng kí tài khoản ");
            System.out.println("2: Đăng nhập hệ thống ");
            try {
                int choice0 = Integer.parseInt(scanner.nextLine());
                switch (choice0){
                    case 1->{
                        System.out.println("------------Đăng kí tài khoản------------");
                        Account account = methods.getAccount();
                        methodsAccount.add(account);
                        System.out.println("\n"+ "------------Đăng kí thành công!------------");
                    }
                    case 2->{
                        if (methods.checkAccount()){
                            System.out.println("Đăng nhập thành công!" + "\n");
                            startMenu:
                            do {
                                try {
                                    System.out.println("--------Menu--------");
                                    System.out.println("1: Quản Lý Người Chơi ");
                                    System.out.println("2: Quản Lý Máy Tính ");
                                    System.out.println("3: Quản Lý Hóa Đơn ");
                                    System.out.println("4: Thoát Chương Trình ");
                                    try {
                                        int choice = Integer.parseInt(scanner.nextLine());
                                        switch (choice){
                                            case 2->{
                                                System.out.println("--------Quản Lý Máy Tính--------");
                                                System.out.println("1: Thêm máy tính ");
                                                System.out.println("2: Sửa thông tin máy tính ");
                                                System.out.println("3: Xóa máy tính ");
                                                System.out.println("4: Hiển thị thông tin máy tính ");
                                                System.out.println("5: Quay Lại Menu");
                                                try {
                                                    int choice1 = Integer.parseInt(scanner.nextLine());
                                                    switch (choice1){
                                                        case 1->{
                                                            Computer computer = methods.getInfoComputer();
                                                            methodsComputer.add(computer);
                                                        }
                                                        case 2->{
                                                            System.out.println("Nhập id máy cần update thông tin ");
                                                            int id = Integer.parseInt(scanner.nextLine());
                                                            System.out.println("Không được update ");
                                                            methodsComputer.update(id);
                                                        }
                                                        case 4-> {
                                                            methodsComputer.show();
                                                        }
                                                        case 3->{
                                                            System.out.println("Nhập id máy tính cần xóa ");
                                                            int id = Integer.parseInt(scanner.nextLine());
                                                            methodsComputer.delete(id);
                                                        }
                                                        case 5->{
                                                            continue startMenu;
                                                        }
                                                        default->{
                                                            System.err.println("Chỉ được nhập từ 1 đến 5 ");
                                                            continue startMenu;
                                                        }
                                                    }
                                                }catch (Exception e){
                                                    System.err.println("Bạn nhập sai rồi chỉ được nhập số thôi! ");
                                                    continue startMenu;
                                                }
                                            }
                                            case 1->{
                                                System.out.println("--------Quản Lý Người Chơi--------");
                                                System.out.println("1: Thêm người chơi ");
                                                System.out.println("2: Sửa thông tin người chơi ");
                                                System.out.println("3: Xóa người chơi ");
                                                System.out.println("4: Hiển thị thông tin người chơi ");
                                                System.out.println("5: Quay lại Menu ");
                                                try {
                                                    int choice2 = Integer.parseInt(scanner.nextLine());
                                                    switch (choice2){
                                                        case 1->{
                                                            Player a = methods.getInfoPlayer();
                                                            methodsPlayer.add(a);
                                                        }
                                                        case 2->{
                                                            System.out.println("Bạn cần sửa thông tin của người chơi nào ? ");
                                                            String name = scanner.nextLine();
                                                            methodsPlayer.update(name);
                                                        }
                                                        case 3->{
                                                            System.out.println("Nhập tên người chơi cần xóa ");
                                                            String name = scanner.nextLine();
                                                            methodsPlayer.delete(name);
                                                        }
                                                        case 4-> {
                                                            methodsPlayer.show();
                                                        }
                                                        case 5-> {
                                                            continue startMenu;
                                                        }
                                                        default -> {
                                                            System.err.println("Chỉ được nhập từ 1 đến 5 ");
                                                            continue startMenu;
                                                        }
                                                    }
                                                }catch (Exception m){
                                                    System.err.println("Bạn nhập sai rồi chỉ được nhập số thôi! ");
                                                    continue startMenu;
                                                }
                                            }
                                            case 3->{
                                                System.out.println("--------Quản Lý Hóa Đơn--------");
                                                System.out.println("1: Thêm hóa đơn ");
                                                System.out.println("2: Xóa hóa đơn ");
                                                System.out.println("3: Hiển thị thông tin hóa đơn ");
                                                System.out.println("4: Quay lại Menu ");
                                                try {
                                                    int choice3 = Integer.parseInt(scanner.nextLine());
                                                    switch (choice3){
                                                        case 1->{
                                                            Bill b = methods.getBill();
                                                            methodsBill.add(b);
                                                        }
                                                        case 2->{
                                                            System.out.println("Nhập vào id hóa đơn muốn xóa ");
                                                            int idBill = Integer.parseInt(scanner.nextLine());
                                                            methodsBill.delete(idBill);
                                                        }
                                                        case 3->methodsBill.show();
                                                        case 4->{
                                                            continue startMenu;
                                                        }
                                                        default -> {
                                                            System.err.println("Chỉ được nhập từ 1 đến 4 ");
                                                            continue startMenu;
                                                        }
                                                    }
                                                }catch (Exception e){
                                                    System.err.println("Bạn nhập sai rồi chỉ được nhập số thôi! ");
                                                    continue startMenu;
                                                }
                                            }
                                            case 4->{
                                                System.exit(0);
                                            }
                                            default -> {
                                                System.err.println("Chỉ được nhập từ 1 đến 4 ");
                                                continue startMenu;
                                            }
                                        }
                                    } catch (Exception o){
                                        System.err.println("Bạn nhập sai rồi chỉ được nhập số thôi! ");
                                    }
                                }catch (Exception e){

                                }
                            }while (true);
                        }
                    }
                }
            }catch (Exception e){

            }
        }while (true);
    }
}