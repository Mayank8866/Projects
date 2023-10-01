import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

interface ICaller {
    void call();
}

class Caller implements ICaller {
    public void call() {
        HMstart();
        Login l=new Login();
        l.log();

    }

    public void HMstart() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("                                Welcome to KS Hospital                       ");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        
    }

}

//import java.util.Scanner;

class Login {
    String Gmail;
    String Password;
    String FGmail = "ms";
    String FPassword ="8866";

    public void log() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Create Account -- Enter 1.  /    Log in --Enter 2.  ");
        int n1 =sc.nextInt();
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
        System.out.println("enter User Name /User Id  ");

        String username = sc.nextLine();
        Gmail = username;
        System.out.println("Enter password");
        String password1 = sc.nextLine();
        Password = password1;
        System.out.println("Congratulation ....! your account cerate sucessfull");
        System.out.println("----------------------------------------------------------------------------------------------");

        Login();
    }

    public void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Log in your account");
        System.out.println("enter User Name /User Id  ");
        String LGmail = sc.nextLine();
        System.out.println("Enter password");
        String LPassword = sc.nextLine();
        if(LGmail.equalsIgnoreCase(Gmail)){
            if(LPassword.equals(Password)){
                System.out.println("Welcome Your account");
              
                
            }
          else{System.out.println("Wrong password ");
          System.out.println("Try again");
          log();}
        }
         else if(LGmail.equalsIgnoreCase(FGmail)){
            if(LPassword.equals(FPassword)){
            System.out.println("Welcome Your account");
           
            
         } 
         else{ 
            System.out.println("wrong password ");
            System.out.println("Try again");
            log();
         }      

    } else{System.out.println("Invalid user ");
    System.out.println("Try again");
    log();}

}}
