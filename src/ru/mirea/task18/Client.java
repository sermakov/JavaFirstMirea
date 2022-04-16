public class Client
{
    String fullName;
    String INN;

    Client(String fullName, String INN)
    {
        this.fullName = fullName;
        this.INN = INN;
    }

    String getFullName() { return fullName; }
    String  getINN() { return INN; }
}