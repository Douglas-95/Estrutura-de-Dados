public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionanNoComeco("Mauricio");
        System.out.println(lista);
        lista.adicionanNoComeco("Paulo");
        System.out.println(lista);
        lista.adicionanNoComeco("Guilherme");
        System.out.println(lista);
        lista.adicionanNoComeco("Douglas");
        System.out.println(lista);
        
        lista.adiciona("Marcelo");
        System.out.println(lista);

        lista.adiciona(2, "Gabriel");
        System.out.println(lista);

    }
}
