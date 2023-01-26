package ro.sda.dependency_injection;

public class Main {
    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.processMessage("Alert", "Clau.com");
    }
}
