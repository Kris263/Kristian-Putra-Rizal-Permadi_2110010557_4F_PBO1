package perpustakaan;

//Class
public class Perpus {
    //Atribute dan Encapsulation
    private String namaBuku, penulis;
    
    //Constructor
    public Perpus (String namaBuku, String penulis) {
        this.namaBuku = namaBuku;
        this.penulis = penulis;
    }

    
    //polymorphism(overloading)
    public Perpus () {
        
    }
    
    //getter(accessor)
    public String getNamaBuku() {
        return namaBuku;
    }
    public String getPenulis() {
        return penulis;
    }
    
    //setter(mutator)
    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
}
