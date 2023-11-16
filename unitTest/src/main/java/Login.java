import java.util.stream.DoubleStream;
import java.util.*;

public class Login {


    public static void main(String[] args) {
        Dictionary dict = new Hashtable();
        initMockData(dict);
        Boolean returnVal = login("108", "Canberra", dict);
        System.out.println("Return Val: "+returnVal);
    }

    static boolean login(String userId, String password, Dictionary dict){
        // Check if valid userId and password

        if (!isValidUser(userId, dict)){
            return false;
        }

        if (!isPasswordValid(userId, password, dict)){
            return false;
        }

        return true;
    }

    static boolean isValidUser(String string, Dictionary dict){

        if (dict.get(string) == null){
            return false;
        }

        return true;
    }

    static boolean isPasswordValid(String userId, String passwordString, Dictionary dict){
        String password = (String) dict.get(userId);
        if (!Objects.equals(password, passwordString)){
            return false;
        }
        return true;
    }

    static void initMockData(Dictionary dict){
        dict.put("101", "Sydney");
        dict.put("102", "Brisbane");
        dict.put("103", "Melbourne");
        dict.put("104", "Perth");
        dict.put("107", "Nelson Bay");
        dict.put("108", "Canberra");
    }
}