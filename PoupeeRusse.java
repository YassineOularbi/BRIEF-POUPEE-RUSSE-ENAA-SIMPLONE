import java.util.Scanner;

public class PoupeeRusse extends Poupee {
    public PoupeeRusse(){
        super();
    }
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
    public void AddRussianDoll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de la première poupée : ");
        String Name = scanner.nextLine();
        setName(Name);
        System.out.println("Entrez la couleur de la première poupée : ");
        String Color = scanner.nextLine();
        setColor(Color);
        System.out.println("Entrez la taille de la première poupée : ");
        int Taille = scanner.nextInt();
        setTaille(Taille);
        System.out.println("Entrez l'etat de la poupée : ");
        Boolean isOpen = scanner.nextBoolean();
        setIsOpen(isOpen);
    }

    public void Display(){
        System.out.println("Name : "+getName()+" Color : " +getColor()+"Taille : "+getTaille()+" ouverte : "+getIsOpen());
    }
}
