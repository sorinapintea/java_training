public class AppMain {


    public static void main(String[] args) {
        ProgramLogic logic = new ProgramLogic();
        Login login = new Login();
        if (login.checkCredentials())
            logic.runSpecificProgram("main");
    }
}