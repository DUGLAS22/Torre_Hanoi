
public class Pila {
    private int ContNodo = 0;
    private Nodo Cabeza;

    public int getContNodo() {
        return ContNodo;
    }

    public void setContNodo(int ContNodo) {
        this.ContNodo = ContNodo;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    public void Push(Nodo n){
        ContNodo++;
        if(Cabeza == null){
            Cabeza = n;
        }else{
            n.setAbajo(Cabeza);
            Cabeza.setArriba(n);
            
            Cabeza = n;
            
        }
    }
    
    public void Pop(){
        if(ContNodo > 0){
            ContNodo--;
            Cabeza = Cabeza.getAbajo();
        }
    }
    
    public String Peek(){
        return Cabeza.getDato();
    }
}
