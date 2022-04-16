import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Client[] clients = new Client[]
                {
                        new Client("Alexey Ivanov", "732432439266"),
                        new Client("Anastasiya Petrova", "737826999262"),
                        new Client("Maxim Sidorov", "732567889267"),
                        new Client("Ekaterina Ivanova", "736789643917"),
                };

        System.out.print("Enter full name: ");
        String input = new Scanner(System.in).nextLine();
        boolean contains = false;
        int clientNumber = 0;
        for (int i = 0; i < clients.length; ++i)
            if (clients[i].getFullName().equals(input))
            {
                contains = true;
                clientNumber = i;
                break;
            }

        try
        {
            if (contains) {
                System.out.print("Enter INN: ");
                input = new Scanner(System.in).nextLine();
                if (clients[clientNumber].getINN().equals(input))
                    System.out.println("INN is valid");
                else throw new Exception("INN is not valid");
            } else throw new Exception("Doesn't exist name: " + input);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}