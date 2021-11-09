import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private ArrayList<Message> indbox;
    private ArrayList<Message> outbox;
    private ArrayList<String> userNames;

    public User(String userName, String password, ArrayList<Message> indbox, ArrayList<Message> outbox, ArrayList<String> userNames) {
        this.userName = userName;
        this.password = password;
        this.indbox = indbox;
        this.outbox = outbox;
        this.userNames = userNames;
    }

    public void sendMessage(){
    }
    public void getUserName(){
    }
    public void receiveMessages(){
    }

}
