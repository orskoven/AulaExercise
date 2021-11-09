import java.util.ArrayList;

public class Admin extends User {

    public Admin(String userName, String password, ArrayList<Message> indbox, ArrayList<Message> outbox, ArrayList<String> userNames) {
        super(userName, password, indbox, outbox, userNames);
    }

    public void sendToAllParents(){

    }
    public void publishNews (){

    }
}
