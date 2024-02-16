import java.util.Scanner;

public class PoupeeRusse extends Poupee {
    private String Name;
    private String Color;
    private Boolean isOpen;
    private Boolean containsDoll;
    public PoupeeRusse(String SuperName, String SuperColor, int SuperTaille, Boolean SuperisOpen){
        super(SuperTaille);
        this.Name = SuperName;
        this.Color = SuperColor;
        this.isOpen = SuperisOpen;
    }
       public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String color){
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
    public Boolean getIsOpen(){
        return isOpen;
    }
    public void setIsOpen(Boolean isopen){
        this.isOpen = isopen;
    }
    public Boolean getContainsDoll() {
        return containsDoll;
    }
    public void setContainsDoll(Boolean containsDoll) {
        this.containsDoll = containsDoll;
    }
    @Override
    public void AddRussianDoll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de la poupée : ");
        String newName = scanner.nextLine();
        this.setName(newName);
        System.out.println("Entrez la couleur de la poupée : ");
        String newColor = scanner.nextLine();
        this.setColor(newColor);
        System.out.println("Entrez la taille de la poupée : ");
        int newTaille = scanner.nextInt();
        this.setTaille(newTaille);
        System.out.println("Entrez l'état de la poupée : ");
        System.out.println("ouverir -> true / fermer -> false : ");
        Boolean newisOpen = scanner.nextBoolean();
        this.setIsOpen(newisOpen);
    }
    @Override
    public void DisplayRussianDoll() {
        System.out.println("| -> Name : "+this.getName());
        System.out.println("| -> Couleur : "+this.getColor());
        System.out.println("| -> Taille : "+this.getTaille());
        System.out.println("| -> ouverte : "+this.getIsOpen());
    }
    @Override
    public void Open() {
        if(!this.getIsOpen()){
            this.setIsOpen(true);
            System.out.println("La poupée "+this.getName()+" a été ouvrir avec succes");
        } else {
            System.out.println("la poupée "+this.getName()+" est déja ouverte");
        }
    }

    @Override
    public void Close() {
        if(this.getIsOpen()){
            this.setIsOpen(false);
            System.out.println("La poupée "+this.getName()+" a été fermer avec succes");
        } else {
            System.out.println("la poupée "+this.getName()+" est déja fermer");
        }
    }

    @Override
    public void PlaceInto(Poupee p) {
        PoupeeRusse poupeeRusse = (PoupeeRusse) p;
        if(poupeeRusse.getContainsDoll()){
            System.out.println("Impossible de placer dans cette poupée");
            System.out.println("Cette poupée contient déja une poupée veuillez le vider!");
        }
        if(!poupeeRusse.getContainsDoll() && poupeeRusse.getIsOpen() && this.getTaille() < p.getTaille()){
            poupeeRusse.setContainsDoll(true);
            System.out.println("la poupée "+this.getName()+" est placée dans "+poupeeRusse.getName());
        }
        if(!poupeeRusse.getIsOpen()){
            System.out.println("Impossible de placer dans cette poupée");
            System.out.println("La poupée est fermer veuiller l'ouvrir");
        }
        if(this.getTaille() > p.getTaille()){
            System.out.println("Impossible de placer dans cette poupée");
            System.out.println("La taille de la poupée est petite");
        }
    }
    @Override
    public void Leave(Poupee p) {
        PoupeeRusse poupeeRusse = (PoupeeRusse) p;
        if(!poupeeRusse.getContainsDoll()){
            System.out.println("Impossible de sortir de cette poupée");
            System.out.println("Cette poupée est vide!");
        }
        if(poupeeRusse.getContainsDoll() && poupeeRusse.getIsOpen()){
            poupeeRusse.setContainsDoll(false);
            System.out.println("la poupée "+this.getName()+" est sortir de "+poupeeRusse.getName());
        }
        if(!poupeeRusse.getIsOpen()){
            System.out.println("Impossible de sortir de cette poupée");
            System.out.println("La poupée est fermer veuiller l'ouvrir");
        }
    }
}
