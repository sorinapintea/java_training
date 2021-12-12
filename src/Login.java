import java.util.HashMap;

public class Login {

    private final HashMap<String, String> USERS_AND_PASS = new HashMap<>();

    public boolean checkCredentials() {
        initUserList();
        ReadFromKeyboard read = new ReadFromKeyboard();
        System.out.println("Enter user:");
        String x = read.getString();
        System.out.println("Enter password:");
        String y = read.getString();
        return USERS_AND_PASS.get(x).equals(y);
    }

    private void initUserList() {
        USERS_AND_PASS.put("Cosmin", "pass");
        USERS_AND_PASS.put("s", "pass");
        USERS_AND_PASS.put("z", "pass");
        USERS_AND_PASS.put("a", "pass");
        USERS_AND_PASS.put("q", "pass");
    }
}