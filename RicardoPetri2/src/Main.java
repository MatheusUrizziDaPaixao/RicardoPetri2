public class Main {
    public static void main(String[] args) {
        // Teste Pilha Simples
        PilhaOperacoes p1 = new PilhaSimples(2);
        p1.empilhar("Prato 1");
        p1.empilhar("Prato 2");
        p1.empilhar("Prato 3"); // Deve dar erro de cheia
        System.out.println("Desempilhando: " + p1.desempilhar());

        System.out.println("---------------------------------------------------");

        // Teste Pilha Dinâmica
        PilhaOperacoes p2 = new PilhaDinamica();
        p2.empilhar("Livro A");
        p2.empilhar("Livro B");
        p2.empilhar("Livro C");
        System.out.println("Desempilhando: " + p2.desempilhar());
        System.out.println("Pilha está vazia? " + p2.vazia());
    }
}