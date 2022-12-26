package patikaDesignPattern;

public class MailService {
    public void sendEmail(){
        connect(1);
        authenticate();
        //send email
        disconnect();

    }

    private void connect(int timeout){
        System.out.println("connect!");
    }

    private void disconnect(){
        System.out.println("disconnect!");
    }
    private void authenticate(){
        System.out.println("authenticate");
    }
}
