import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryAttack implements PasswordCracker{
    private String password;
    @Override
    public void hackPassword(User user)  {
        try {
            File myObj = new File("/var/Factory/src/password.txt");
            Scanner scanner = new Scanner(myObj);
            while (scanner.hasNextLine()) {
                this.password = scanner.nextLine();
                System.out.println(this.password);
                if (user.checkPassword(this.password))
                {
                    System.out.println("Mot de passe retrouvé");
                    scanner.close();
                    return ;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return ;
    }
}
