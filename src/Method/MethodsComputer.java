package Method;
import Manage.Computer;
import java.util.ArrayList;
public class MethodsComputer {
    static ArrayList<Computer> computers = new ArrayList<>();
    final String PATH = "C:\\Users\\TTC\\Desktop\\CaseStudy\\CaseStudy2\\src\\Computer.dat";
    public MethodsComputer(){
        computers = (ArrayList<Computer>) ReadAndWrite.readFromFile(PATH);
    }
    public void add(Computer computer){

        computers.add(computer);
        ReadAndWrite.writeObjectToFile(computers,PATH);
    }
    public void show(){
        for (Computer i : computers) {
            System.out.println(i.toString());
        }
    }
    public void update(int id){
        for (Computer i : computers) {
            if(i.getId() == id){
            }
        }
        ReadAndWrite.writeObjectToFile(computers,PATH);
    }
    public void delete(int id){
        for (Computer i : computers) {
            if (i.getId()== id){
                computers.remove(i);
                break;
            }
        }
        ReadAndWrite.writeObjectToFile(computers,PATH);
    }
    public Computer getComputerById(int id){
        Computer computerr = null;
        for (Computer b : computers) {
            if(b.getId() == id){
                computerr = b;
            }
        }
        return computerr;
    }
    public boolean checkId(int id){
        boolean a = true;
        for (Computer b : computers) {
            a = b.getId() != id;
        }
        return a;
    }
}