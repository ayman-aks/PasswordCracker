import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String a[]) throws InterruptedException {
        String password=null;
        int choice=0;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Veuillez saisir un mot de passe qui ne contient pa sde chiffres et qui ne dépasse pas 4 caractères");
            password=scanner.nextLine();
        }while (password==null );
        User user=new User(password.toLowerCase(Locale.ROOT)) ;
        System.out.println("Merci de choisir la méthode d'attaque.\n 1) Brute force Attack \n *) Dictionary Attack");
        choice=scanner.nextInt();
        Attack attack=new Attack();
        PasswordCracker passwordCracker=attack.getInstance(choice);
        passwordCracker.hackPassword(user);
    }
}
