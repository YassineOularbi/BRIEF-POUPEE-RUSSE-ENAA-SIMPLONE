import java.util.Scanner;

public class PoupeeRusse extends Poupee {
    public PoupeeRusse(){
        super();
    }
    PoupeeRusse oopPoupeeRusse = new PoupeeRusse();
    private String Name;
    private String Color;
    private Boolean isOpen;
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

    @Override
    public void Open() {

    }

    @Override
    public void Close() {

    }

    @Override
    public void PlaceInto(Poupee p) {

    }

    @Override
    public void Leave(Poupee p) {

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
}
