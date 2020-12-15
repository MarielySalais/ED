package EstructurasLineales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada=new ListaEnlazada();
        listaEnlazada.insertar(new Cancion("Navidad 1", "./navidad.mp3",65));
        listaEnlazada.insertar(new Cancion("Navidad 2", "./navidad.mp3",65));
        listaEnlazada.insertar(new Cancion("Navidad 3", "./navidad.mp3",65));
        listaEnlazada.mostrarElementos();
        LinkedList<Cancion>listaJava=new LinkedList<>();
        listaJava.add(new Cancion("tutu","./tutu.mp3",65));
        listaJava.add(new Cancion("tutu 2","./tutu.mp3",65));
        listaJava.add(new Cancion("tutu 3","./tutu.mp3",65));
        for (int x=0;x<listaJava.size();x++){
            Cancion c=listaJava.get(2);
            System.out.println(c.getNombre());
        }
        



        /*Stack<Usuarios> pila= new Stack<>();
        Stack<Integer> pila2= new Stack<>();
        Queue<Usuarios> cola=new LinkedList<>();
        pila.add(new Usuarios("Yo","calle tal", "6361121323"));
        pila.add(new Usuarios("TU","calle tal", "6361121323"));
        pila.add(new Usuarios("El","calle tal", "6361121323"));
        Usuarios cachar= pila.pop();
        System.out.println(cachar.getNombre());
        cachar=pila.pop();
        System.out.println(cachar.getNombre());
        pila.pop();
        if (pila.isEmpty()) System.out.println("Esta Vacia");
        pila2.add(1);
        pila2.add(2);
        pila2.add(3);
        cola.add(new Usuarios("Monica","calle lolo","6361279945"));
        cola.add(new Usuarios("Mario","calle lolo","6361279946"));
        cola.add(new Usuarios("Maria","calle lolo","6361279947"));
        Usuarios urs= cola.poll();
        System.out.println(urs.getNombre());
        cola.clear();//limpiando la cola
        pila.clear();//limpiando la pila
        Usuarios cachar2=cola.peek();
        System.out.println(cachar2.getNombre());*/


    }
}
