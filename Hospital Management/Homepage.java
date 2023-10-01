import java.util.Scanner;

class Homepage {
  public void hPage() {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("----------------------------------------------------------------------------------------");
    System.out.println();
    System.out.println("--------------------------------------Home Page--------------------------------------");

    System.out.println("     Docters Details       --      Enter 1.");
    System.out.println("     Services              --      Enter 2.");
    System.out.println("     Department            --      Enter 3.");
    System.out.println("     Coutac US             --      Enter 4.");
    System.out.println("     About                 --      Enter 5.");


    System.out.println("                     Please Shoose Service and Enter number           ");
    int n2 = sc.nextInt();

    switch (n2) {
      case 1: {
        doctersDetails();
        break;
      }
      case 2: {
        services();
        break;
      }
      case 3: {
        Department();
        break;
      }
      case 4: {
        CoutacUS();
        break;
      }
      case 5: {
        about();
        break;
      }

      default: {
      }
    }

  }

  public void doctersDetails() {
    Scanner sc = new Scanner(System.in);

    System.out.println("-------------------------- Docters Details-------------------------");

    System.out.println("1.   Dr. D.k. vaema    ---  chief Executive officer (CEO)");
    System.out.println("                            ADMINISTRATION                ");
    System.out.println();
    System.out.println();
    System.out.println(" 2.   Dr. H.H.kumar  ---      Consultant - internal medicine ");
    System.out.println();
    System.out.println();
    System.out.println(" 3.   Dr. S.K.Raman  ---      Consultant - Neurology   ");
    System.out.println();
    System.out.println();
    System.out.println(" 4.   Dr. M.Kumar  ---      Consultant - Neuro Surgrey   ");
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("       GO To   --   Home page    --- Enter 1");

    int u = sc.nextInt();
    if (u == 1) {
      hPage();
  System.out.println("---------------------------------------------------------------------------------------");

    }

  }

  public void services() {
    Scanner sc = new Scanner(System.in);

    System.out.println("---------------------------------Services ----------------------------");
    System.out.println("          Home page    --- Enter 1");
    int u = sc.nextInt();
    if (u == 1) {
      hPage();
    }
  }

  public void Department() {
    Scanner sc = new Scanner(System.in);

    System.out.println("------------------------------------Department--------------------------------");
    System.out.println("          Home page    --- Enter 1");
    int u = sc.nextInt();
    if (u == 1) {
      hPage();
    }
  }

  public void CoutacUS() {
    Scanner sc = new Scanner(System.in);

    System.out.println(" ----------------------------------Coutac US------------------");
    System.out.println("          Home page    --- Enter 1");
    int u = sc.nextInt();
    if (u == 1) {
      hPage();
    }
  }
  public void  about(){        Scanner sc = new Scanner(System.in);
    System.out.println(" ----------------------------------  About  ------------------");
  System.out.println("          Home page    --- Enter 1");
  int u = sc.nextInt();
  if (u == 1) {
    hPage();
  }}

}
