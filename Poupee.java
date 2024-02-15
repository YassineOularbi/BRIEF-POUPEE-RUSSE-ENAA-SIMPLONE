public abstract class Poupee {
    private String Name;
    private int Taille;
    private Boolean isOpen;
    public Poupee (String name, int taille, Boolean isopen){
            this.Name = name;
            this.Taille = taille;
            this.isOpen = isopen;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public int getTaille(){
        return Taille;
    }
    public void setTaille(int taille){
        this.Taille = taille;
    }

    public Boolean getOpen() {
        return isOpen;
    }
    public void setOpen(Boolean isopen){
        this.isOpen = isopen;
    }
    public abstract void Open();
    public abstract void Close();
    public abstract void PlaceInto(Poupee p);
    public abstract void Leave (Poupee p);
}


