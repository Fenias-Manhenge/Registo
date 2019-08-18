
/**
 *
 * @author Fenias
 */
import java.util.*;

public class SistemaRegisto {

     public Vector y=new Vector();
     
    public void  registoLivro(){
         Scanner t=new Scanner(System.in);
         Registo a = null;
         int code;
         
        do{System.out.println("INTRODUZA O CODIGO DO LIVRO: ");
            code=t.nextInt();
            if(a.codigo==code){
            a=new Registo();
            a.codigo=(code);
                System.out.println("INTRODUZA O TITULO: ");
                a.settitulo(t.next());
                System.out.println("INTRODUZA O AUTOR: ");
                a.autor=t.next();
                System.out.println("INTODUZA O PRECO: ");
                a.setpreco(t.nextDouble());
                y.addElement(a);
            }
        }while(a.codigo==code);
    }
    public void actualizarlivro(){
         Scanner t=new Scanner(System.in);
         Registo m = null;
         
         System.out.println("INTRODUZA O CODIGO DO LIVRO: ");
         int code=t.nextInt();
         for(int i=0;i<y.size();i++)
             m=(Registo)y.get(i);
              if(m.codigo==code) {
                 System.out.println("INTRODUZA O TITULO: ");
                 m.settitulo(t.next());
                 System.out.println("INTRODUZIR O AUTOR: ");
                 m.autor=t.next();
                 System.out.println("INTRODUZA O PRECO: ");
                 m.setpreco(code);
                 y.setElementAt(m,code);
             }else{System.err.print("impossivel actualizar o  livro");
         } 
    }
    public void apagarLivro(){
        Scanner t=new Scanner(System.in);
         Registo s = null;
         
         System.out.println("INTRODUZA O CODIGO DO LIVRO: ");
         int code=t.nextInt();
         for(int i=0;i<y.size();i++){
             s=(Registo)y.get(i);
              if(s.codigo==code) {
                 y.removeElementAt(i);
             }     
         }  
    }
    public void visualizaLivro(){
        Scanner t=new Scanner(System.in);
         Registo k = null;
         
         System.out.println("INTRODUZA O CODIGO DO LIVRO: ");
         int code=t.nextInt();
         if(k.codigo==code)
            System.out.println(k.autor+" "+k.gettitulo());    
    }
    public void ordemCrescenteLivro(){
        Registo d,u;
        
        for(int i=0;i<y.size()-1;i++)
            for(int j=i+1;i<y.size();j++){
                d=(Registo)y.get(i);
                u=(Registo)y.get(i);
                if(d.codigo>u.codigo){
                    y.setElementAt(u, i);
                    y.setElementAt(d, j);
                }
            }    
    }
    public void Menu(){
     int s;
      Scanner t=new Scanner(System.in);
      
      do{System.out.println("MENU DO SISTEMA ");
          System.out.println("---------------");
          System.out.println("1.REGISTO DOS LIVROS ");
          System.out.println("2.ACTUALIZACAO DOS LIVROS ");
          System.out.println("3.REMOCAO DE UM LIVRO ");
          System.out.println("4.VISUALIZACAO DOS LIVROS ");
          System.out.println("5.ORDEM CRESCENTE  DOS LIVROS ");
          System.out.println("6.EXIT ");
          System.out.println("OPCAO:[1/2/3/4/5/6]");
          s=t.nextInt();
          
          switch(s){
              case 1: registoLivro();break;
              case 2: actualizarlivro();break;
              case 3: apagarLivro();break;
              case 4: visualizaLivro();break;
              case 5: ordemCrescenteLivro();break;
              case 6:System.exit(0);
            }
        }while(true);
    }
    public static void main(String[] args) {
        SistemaRegisto f=new SistemaRegisto();
        f.Menu();
    }
}
