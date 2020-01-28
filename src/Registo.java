
/**
 *
 * @author Fenias
 */
public class Registo {
    public int codigo;
    public String autor;
    private String titulo;
    private double preco;
    
    public Registo(){
        this.codigo=0;
        this.autor="    ";
        this.titulo="    ";
        this.preco=0.0;
    }
    public void settitulo(String titulo) {
        this.titulo=titulo;
    }
    public String gettitulo(){
        return titulo;
    }
    public void setpreco(double p){
        this.preco=p;
    }
    public double getpreco(){
        return preco;
    }

}
