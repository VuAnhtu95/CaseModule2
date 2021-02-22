package Method;

import Manage.Account;
import Manage.Bill;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsAccount {
    static ArrayList<Account> accounts;
    static final String PATH = "C:\\Users\\TTC\\Desktop\\CaseStudy\\CaseStudy2\\src\\Account.dat";
    public MethodsAccount(){
    }
    public void add(Account account){
        accounts = (ArrayList<Account>) ReadAndWrite.readFromFile(PATH);
        accounts.add(account);
        ReadAndWrite.writeObjectToFile(accounts,PATH);
    }
    public static boolean checkId(String id, String pass){
        accounts = (ArrayList<Account>) ReadAndWrite.readFromFile(PATH);
        boolean a = false;
        for (Account account : accounts) {
            if (account.getId().equals(id) && account.getPassWord().equals(pass)){
                a = true;
            }
        }
        return a;
    }
    public void show(){
        accounts = (ArrayList<Account>) ReadAndWrite.readFromFile(PATH);
        for (Account account : accounts){
            System.out.println(account.toString());
        }
    }
    public boolean checkId(String id){
        accounts = (ArrayList<Account>) ReadAndWrite.readFromFile(PATH);
        boolean a = true;
        for (Account account : accounts) {
            if (account.getId().equals(id)){
                a = false;
            }
        }
        return a;
    }

    public static boolean checkPass(String pass){
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }
}
