import views.Welcome;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Welcome w=new Welcome();
        do{
            w.WelcomeScreen();
        }while(true);
    }
}
