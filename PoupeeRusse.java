import java.util.Scanner;

public class PoupeeRusse extends Poupee {
    private String Name;
    private String Color;
    private Boolean isOpen;
    private PoupeeRusse containsDoll;
    private PoupeeRusse intoDoll;

    public PoupeeRusse(String SuperName, String SuperColor, int SuperTaille, Boolean SuperisOpen) {
        super(SuperTaille);
        this.Name = SuperName;
        this.Color = SuperColor;
        this.isOpen = SuperisOpen;
        this.containsDoll = null;
        this.intoDoll = null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    @Override
    public int getTaille() {
        return super.getTaille();
    }

    @Override
    public void setTaille(int taille) {
        super.setTaille(taille);
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isopen) {
        this.isOpen = isopen;
    }

    public PoupeeRusse getContainsDoll() {
        return containsDoll;
    }

    public void setContainsDoll(PoupeeRusse containsDoll) {
        this.containsDoll = containsDoll;
    }

    public PoupeeRusse getIntoDoll() {
        return intoDoll;
    }

    public void setIntoDoll(PoupeeRusse intoDoll) {
        this.intoDoll = intoDoll;
    }

    @Override
    public void AddRussianDoll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("| Entrez le nom de la poupée :       |");
        String newName = scanner.nextLine();
        this.setName(newName);
        System.out.println("| Entrez la couleur de la poupée :   |");
        String newColor = scanner.nextLine();
        this.setColor(newColor);
        System.out.println("| Entrez la taille de la poupée :    |");
        int newTaille = scanner.nextInt();
        this.setTaille(newTaille);
        System.out.println("+------------------------------------+");
        System.out.println("|        État de la Poupée           |");
        System.out.println("+------------------------------------+");
        System.out.println("| Ouvrir -> true / Fermer -> false : |");
        Boolean newisOpen = scanner.nextBoolean();
        this.setIsOpen(newisOpen);
    }

    @Override
    public void DisplayRussianDoll() {
        System.out.println("| -> Nom : " + this.getName());
        System.out.println("| -> Couleur : " + this.getColor());
        System.out.println("| -> Taille : " + this.getTaille());
        System.out.println("| -> Ouverte : " + this.getIsOpen());
        if (this.getContainsDoll() == null) {
            System.out.println("| -> Contient une poupée : Non");
        } else {
            System.out.println("| -> Contient la poupée : " + this.getContainsDoll().getName());
        }
        if (this.getIntoDoll() == null) {
            System.out.println("| -> Placer dans une poupée : Non");
        } else {
            System.out.println("| -> Placer dans la poupée : " + this.getIntoDoll().getName());
        }

    }

    @Override
    public void Open() {
        if (this.getIsOpen()) {
            System.out.println("+------------------------------------+");
            System.out.println("|          État de la Poupée         |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " est déjà ouverte.");
        } else if (!(this.getIntoDoll() == null) && !this.getIntoDoll().getIsOpen()) {
            System.out.println("+------------------------------------+");
            System.out.println("|  Impossible d'Ouvrir la Poupée     |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " est placée dans la poupée " + this.getIntoDoll().getName() + " fermée.");
        } else {
            this.setIsOpen(true);
            System.out.println("+------------------------------------+");
            System.out.println("|       Ouverture de la Poupée       |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " a été ouverte avec succès.");
        }
    }

    @Override
    public void Close() {
        if (!this.getIsOpen()) {
            System.out.println("+------------------------------------+");
            System.out.println("|          État de la Poupée         |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " est déjà fermée.");
        } else if (!(this.getContainsDoll() == null) && this.getContainsDoll().getIsOpen()) {
            System.out.println("+------------------------------------+");
            System.out.println("|   Impossible de fermer la Poupée   |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " contient la poupée " + this.getContainsDoll().getName() + " ouverte.");
        } else {
            this.setIsOpen(false);
            System.out.println("+------------------------------------+");
            System.out.println("|       Fermeture de la Poupée       |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " a été fermée avec succès.");
        }
    }

    @Override
    public void PlaceInto(Poupee p) {
        PoupeeRusse poupeeRusse = (PoupeeRusse) p;
        if (!poupeeRusse.getIsOpen()) {
            System.out.println("+------------------------------------+");
            System.out.println("|   Impossible d'Insérer la Poupée   |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + poupeeRusse.getName() + " est fermée. Veuillez l'ouvrir.");
        } else if (this.getTaille() > poupeeRusse.getTaille()) {
            System.out.println("+------------------------------------+");
            System.out.println("|       Taille de la Poupée          |");
            System.out.println("+------------------------------------+");
            System.out.println("La taille de la poupée " + poupeeRusse.getName() + " est petite : " + poupeeRusse.getTaille());
        } else if (!(this.getIntoDoll() == null)) {
            System.out.println("+------------------------------------+");
            System.out.println("|         Poupée déjà Placée         |");
            System.out.println("+------------------------------------+");
            System.out.println("Cette poupée " + this.getName() + " est déjà dans la poupée " + this.getIntoDoll().getName() + ".");
        } else if (!(poupeeRusse.getContainsDoll() == null)) {
            System.out.println("+------------------------------------+");
            System.out.println("|        Poupée Contient dèjà        |");
            System.out.println("+------------------------------------+");
            System.out.println("Cette poupée " + poupeeRusse.getName() + " contient déjà la poupée " + poupeeRusse.getContainsDoll().getName() + ". Veuillez la vider.");
        } else {
            poupeeRusse.setContainsDoll(this);
            this.setIntoDoll(poupeeRusse);
            System.out.println("+------------------------------------+");
            System.out.println("|      Insertion de la Poupée        |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + this.getName() + " est placée dans " + poupeeRusse.getName() + ".");
        }

    }

    @Override
    public void Leave(Poupee p) {
        PoupeeRusse poupeeRusse = (PoupeeRusse) p;
        if (!poupeeRusse.getIsOpen()) {
            System.out.println("+------------------------------------+");
            System.out.println("|   Impossible de Sortir la Poupée   |");
            System.out.println("+------------------------------------+");
            System.out.println("La poupée " + poupeeRusse.getName() + " est fermée. Veuillez l'ouvrir.");
        } else if (poupeeRusse.getContainsDoll() == null) {
            System.out.println("+------------------------------------+");
            System.out.println("|            Poupée Vide             |");
            System.out.println("+------------------------------------+");
            System.out.println("|       Cette poupée est vide !      |");
        } else if (this.getIntoDoll() == null) {
            System.out.println("+------------------------------------+");
            System.out.println("|          Poupée Non Placée         |");
            System.out.println("+------------------------------------+");
            System.out.println("Cette poupée " + this.getName() + " n'a jamais été placée dans une autre !");
        } else if (!(this.getName().equals(poupeeRusse.getContainsDoll().getName()))) {
            System.out.println("+------------------------------------+");
            System.out.println("|           Contenu Incorrect        |");
            System.out.println("+------------------------------------+");
            System.out.println("Cette poupée ne contient pas la poupée " + this.getName() + ".");
            System.out.println("Cette poupée contient la poupée " + poupeeRusse.getContainsDoll().getName() + ". Veuillez la vider !");
        } else {
                poupeeRusse.setContainsDoll(null);
                this.setIntoDoll(null);
                System.out.println("+------------------------------------+");
                System.out.println("|         Sortie de la Poupée        |");
                System.out.println("+------------------------------------+");
                System.out.println("La poupée " + this.getName() + " est sortie de " + poupeeRusse.getName() + ".");
            }
        }
    }
