import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    PoupeeRusse oopPoupeeRusse1 = new PoupeeRusse("", "", 0, false);
    PoupeeRusse oopPoupeeRusse2 = new PoupeeRusse("", "", 0, false);
    PoupeeRusse oopPoupeeRusse3 = new PoupeeRusse("", "", 0, false);

    public void MenuInterface() {

        int Choix;
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
                    GameInterface();
                    break;
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
    public void GameInterface (){
        int ChoixGame;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("|      Aller, jouer poupée russe     |");
            System.out.println("+------------------------------------+");
            System.out.println("|      1. Ouvrir une poupée.         |");
            System.out.println("|      2. Fermer une poupée.         |");
            System.out.println("|      3. Placer dans.               |");
            System.out.println("|      4. Sortir de.                 |");
            System.out.println("|      5. Retourner au menu.         |");
            System.out.println("+------------------------------------+");
            System.out.print("          Entrez un choix : ");
            ChoixGame = scanner.nextInt();
            switch (ChoixGame) {
                case 1:
                    int ChoixOpen;
                    System.out.println("+------------------------------------+");
                    System.out.println("|       ouvrir une Poupée Russe      |");
                    System.out.println("+------------------------------------+");
                    System.out.println("| choisir la poupée a ouvrir 1,2 ou 3|");
                    System.out.println("+------------------------------------+");
                    System.out.print("          Entrez un choix : ");
                    ChoixOpen = scanner.nextInt();
                    switch (ChoixOpen){
                        case 1 :
                            oopPoupeeRusse1.Open();
                            break;
                        case 2 :
                            oopPoupeeRusse2.Open();
                            break;
                        case 3 :
                            oopPoupeeRusse3.Open();
                            break;
                        default:
                            System.out.println("|      Entrez un choix valid !       |");
                            break;
                    }
                    break;
                case 2:
                    int ChoixClose;
                    System.out.println("+------------------------------------+");
                    System.out.println("|       fermer une Poupée Russe      |");
                    System.out.println("+------------------------------------+");
                    System.out.println("| choisir la poupée a fermer 1,2 ou 3|");
                    System.out.println("+------------------------------------+");
                    System.out.print("          Entrez un choix : ");
                    ChoixClose = scanner.nextInt();
                    switch (ChoixClose){
                        case 1 :
                            oopPoupeeRusse1.Close();
                            break;
                        case 2 :
                            oopPoupeeRusse2.Close();
                            break;
                        case 3 :
                            oopPoupeeRusse3.Close();
                            break;
                        default:
                            System.out.println("|      Entrez un choix valid !       |");
                            break;
                    }
                    break;
                case 3:
                    int ChoixPlaceIn;
                    System.out.println("+------------------------------------+");
                    System.out.println("|       Placer une Poupée Russe      |");
                    System.out.println("+------------------------------------+");
                    System.out.println("|  1. Placer poupée 1 dans poupée 2. |");
                    System.out.println("|  2. Placer poupée 1 dans poupée 3. |");
                    System.out.println("|  3. Placer poupée 2 dans poupée 1. |");
                    System.out.println("|  4. Placer poupée 2 dans poupée 3. |");
                    System.out.println("|  5. Placer poupée 3 dans poupée 1. |");
                    System.out.println("|  6. Placer poupée 3 dans poupée 2. |");
                    System.out.println("+------------------------------------+");
                    System.out.print("          Entrez un choix : ");
                    ChoixPlaceIn = scanner.nextInt();
                    switch (ChoixPlaceIn){
                        case 1 :
                            oopPoupeeRusse1.PlaceInto(oopPoupeeRusse2);
                            break;
                        case 2 :
                            oopPoupeeRusse1.PlaceInto(oopPoupeeRusse3);
                            break;
                        case 3 :
                            oopPoupeeRusse2.PlaceInto(oopPoupeeRusse1);
                            break;
                        case 4 :
                            oopPoupeeRusse2.PlaceInto(oopPoupeeRusse3);
                            break;
                        case 5 :
                            oopPoupeeRusse3.PlaceInto(oopPoupeeRusse1);
                            break;
                        case 6 :
                            oopPoupeeRusse3.PlaceInto(oopPoupeeRusse2);
                            break;
                        default:
                            System.out.println("|      Entrez un choix valid !       |");
                            break;
                    }
                    break;
                case 4:
                    int ChoixLeave;
                    System.out.println("+------------------------------------+");
                    System.out.println("|       Sortir une Poupée Russe      |");
                    System.out.println("+------------------------------------+");
                    System.out.println("|  1. Sortir poupée 1 dans poupée 2. |");
                    System.out.println("|  2. Sortir poupée 1 dans poupée 3. |");
                    System.out.println("|  3. Sortir poupée 2 dans poupée 1. |");
                    System.out.println("|  4. Sortir poupée 2 dans poupée 3. |");
                    System.out.println("|  5. Sortir poupée 3 dans poupée 1. |");
                    System.out.println("|  6. Sortir poupée 3 dans poupée 2. |");
                    System.out.println("+------------------------------------+");
                    System.out.print("          Entrez un choix : ");
                    ChoixLeave = scanner.nextInt();
                    switch (ChoixLeave){
                        case 1 :
                            oopPoupeeRusse1.Leave(oopPoupeeRusse2);
                            break;
                        case 2 :
                            oopPoupeeRusse1.Leave(oopPoupeeRusse3);
                            break;
                        case 3 :
                            oopPoupeeRusse2.Leave(oopPoupeeRusse1);
                            break;
                        case 4 :
                            oopPoupeeRusse2.Leave(oopPoupeeRusse3);
                            break;
                        case 5 :
                            oopPoupeeRusse3.Leave(oopPoupeeRusse1);
                            break;
                        case 6 :
                            oopPoupeeRusse3.Leave(oopPoupeeRusse2);
                            break;
                        default:
                            System.out.println("|      Entrez un choix valid !       |");
                            break;
                    }
                case 5 :
                    MenuInterface();
                    break;
                default:
                    System.out.println("|      Entrez un choix valid !       |");
                    break;
            }
        }while (ChoixGame != 5);
    }
}