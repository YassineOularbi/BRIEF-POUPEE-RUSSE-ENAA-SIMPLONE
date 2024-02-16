import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    PoupeeRusse oopPoupeeRusse1 = new PoupeeRusse("", "", 0, false);
    PoupeeRusse oopPoupeeRusse2 = new PoupeeRusse("", "", 0, false);
    PoupeeRusse oopPoupeeRusse3 = new PoupeeRusse("", "", 0, false);

    public void MenuInterface() {

        int Choix = 4;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("| Bienvenue dans Le jeu Poupée Russe |");
            System.out.println("+------------------------------------+");
            System.out.println("|      1. Ajouter un poupée.         |");
            System.out.println("|      2. Afficher les poupée.       |");
            System.out.println("|      3. Commencer le jeu.          |");
            System.out.println("|      4. Quitter le jeu.            |");
            System.out.println("+------------------------------------+");
            System.out.print("          Entrez un choix : ");
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1:
                    System.out.println("+------------------------------------+");
                    System.out.println("|      Ajouter la poupée numéro 1    |");
                    System.out.println("+------------------------------------+");
                    oopPoupeeRusse1.AddRussianDoll();
                    System.out.println("+------------------------------------+");
                    System.out.println("|      Ajouter la poupée numéro 2    |");
                    System.out.println("+------------------------------------+");
                    oopPoupeeRusse2.AddRussianDoll();
                    System.out.println("+------------------------------------+");
                    System.out.println("|      Ajouter la poupée numéro 3    |");
                    System.out.println("+------------------------------------+");
                    oopPoupeeRusse3.AddRussianDoll();
                    break;
                case 2:
                    System.out.println("+------------------------------------+");
                    System.out.println("|  La liste des poupées disponible   |");
                    System.out.println("+------------------------------------+");
                    System.out.println("| ------    Poupée Russe 1    ------ |");
                    oopPoupeeRusse1.DisplayRussianDoll();
                    System.out.println("| ------    Poupée Russe 2    ------ |");
                    oopPoupeeRusse2.DisplayRussianDoll();
                    System.out.println("| ------    Poupée Russe 3    ------ |");
                    oopPoupeeRusse3.DisplayRussianDoll();
                    break;
                case 3:
                case 4:
                    System.out.println("+------------------------------------+");
                    System.out.println("| Vous avez quitté le jeu, à bientot |");
                    System.out.println("+------------------------------------+");
                    break;
                default:
                    System.out.println("|      Entrez un choix valid !       |");
                    break;
            }
        } while (Choix != 4);

    }
}