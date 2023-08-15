import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> minhalista = new ArrayList();
        adicionarnalista(1, minhalista);
        System.out.println(lerlista(minhalista));
        atualizarlista(minhalista, 23, 0);
        removerdalista(minhalista, 0);
    }

    public static void adicionarnalista(int elemento, ArrayList<Integer> lista){
        lista.add(elemento);
        System.out.println(lista);
    }

    public static ArrayList<Integer> lerlista(ArrayList<Integer> lista){
        return lista;
    }

    public static void atualizarlista(ArrayList<Integer> lista, int elemento, int posicao){
        lista.set(posicao, elemento);
        System.out.println(lista);
    }

    public static void removerdalista(ArrayList<Integer> lista, int posicao){
       lista.remove(posicao);
        System.out.println(lista);
    }
}