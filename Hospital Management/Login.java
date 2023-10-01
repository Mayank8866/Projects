
import java.util.Scanner;

class Login {
    String Gmail;
    String Password;
    String FGmail = "ms";
    String FPassword ="8866";

    public void log() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Create Account -- Enter 1.  /    Log in --Enter 2.  ");
        int n1 = sc.nextInt();
        if (n1 == 1) {
            createAccount();
        } else if (n1 == 2) {
            Login();
        } else {
            System.out.println("Somthing Wrong please ReStart");
        }

    }

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create your account");
        String username = sc.nextLine();
        Gmail = username;
        System.out.println("enter User Name /User Id  ");
        System.out.println("Enter password");
        String password1 = sc.nextLine();
        Password = password1;

        Login();
    }

    public void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" LOg in ");
        System.out.println("enter User Name /User Id  ");
        String LGmail = sc.nextLine();
        System.out.println("Enter password");
        String LPassword = sc.nextLine();

    }

}
