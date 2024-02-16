public abstract class Poupee {
    private int Taille;
    public Poupee (int taille){
            this.Taille = taille;
    }
    public int getTaille(){
        return Taille;
    }
    public void setTaille(int taille){
        this.Taille = taille;
    }

    public abstract void Open();
    public abstract void Close();
    public abstract void PlaceInto(Poupee p);
    public abstract void Leave (Poupee p);
    public abstract void AddRussianDoll();
    public abstract void DisplayRussianDoll();
}


