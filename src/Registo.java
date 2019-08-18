
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
    /*public void setcodigo(int codigo){
        this.codigo=codigo;
    }
    public int getcodigo(){
        return codigo;
    }
    public String getautor(){
        return autor;
    }
    public void setautor(String autor){
        this.autor=autor;
    }*/
    public void settitulo(String titulo) {
        this.titulo=titulo;
    }
    public String gettitulo(){
        return titulo;
    }
    public void setpreco(double preco){
        this.preco=preco;
    }
    public double getpreco(){
        return preco;
    }

}
