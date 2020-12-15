package EstructurasLineales;

public class ListaEnlazada {
    Nodo inicio;
    public ListaEnlazada(){
        inicio=null;
    }
    public void insertar(Cancion cancion){
        Nodo nuevoNodo=new Nodo(cancion);
        if (this.inicio==null){
            this.inicio=nuevoNodo;
        }else {
            Nodo nodoAtual=inicio.getSiguiente();
            if (nodoAtual==null){
                inicio.setSiguiente(nuevoNodo);
            }else {
                while (nodoAtual.getSiguiente() !=null){
                    nodoAtual=nodoAtual.getSiguiente();
                }
                nodoAtual.setSiguiente(nuevoNodo);
            }
        }
    }
    public void mostrarElementos(){

        Nodo nodoAtual=inicio;
        while (nodoAtual.getSiguiente()!=null){
            System.out.print(nodoAtual.getCancion().getNombre()+" ");
            System.out.print(nodoAtual.getCancion().getDuracion()+" ");
            System.out.println(nodoAtual.getCancion().getRuta()+" ");
            nodoAtual=nodoAtual.getSiguiente();
        }
        System.out.print(nodoAtual.getCancion().getNombre()+" ");
        System.out.print(nodoAtual.getCancion().getDuracion()+" ");
        System.out.println(nodoAtual.getCancion().getRuta()+" ");

    }
}
