package patikaDesignPattern;

public class Main {
    public static void main(String[] args) {
        User user =new User("Semra");
        //user.name="Semra";
        //System.out.println(user.name);
        user.sayHello();

        var account =new Account();
      account.deposit(10);
      account.witdraw(5);
        System.out.println(account.getBalance());

        var mailService = new MailService();
        mailService.sendEmail();

        var textBox =new TextBox();
        textBox.enable();


        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }
    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
