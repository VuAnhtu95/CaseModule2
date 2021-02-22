package Method;
import Manage.Bill;
import java.util.ArrayList;

public class MethodsBill {
    static ArrayList<Bill> bills = new ArrayList<>();
    final String PATH = "C:\\Users\\TTC\\Desktop\\CaseStudy\\CaseStudy2\\src\\Bill.dat";
    public MethodsBill(){
        bills = (ArrayList<Bill>) ReadAndWrite.readFromFile(PATH);
    }
    public void add(Bill bill){
        bills.add(bill);
        ReadAndWrite.writeObjectToFile(bills,PATH);
    }
    public void show(){
        for (Bill i :bills) {
            System.out.println(i.toString());
        }
    }

    public void delete(int id){
        for (Bill bill : bills) {
            if (bill.getId()==id){
                bills.remove(bill);
                break;
            }
        }
        ReadAndWrite.writeObjectToFile(bills,PATH);
    }
    public boolean checkId(int id){
        boolean a = true;
        for (Bill b : bills) {
            a = b.getId() != id;
        }
        return a;
    }
}