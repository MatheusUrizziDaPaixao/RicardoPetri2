public class PilhaSimples implements PilhaOperacoes {
    private String[] elementos;
    private int topo;

    // Inicializa
    public PilhaSimples(int tamanho) {
        this.elementos = new String[tamanho];
        this.topo = -1;
        System.out.println("Pilha simples criada");
    }

    @Override
    public boolean vazia() {
        return (topo == -1);
    }

    @Override
    public boolean cheia() {
        return (topo == elementos.length - 1);
    }

    @Override
    public void empilhar(String x) {
        if (cheia()) {
            System.out.println("Erro: A pilha está cheia");
        } else {
            elementos[++topo] = x;
            System.out.println("Elemento " + x + " adicionado à piljha");
        }
    }

    @Override
    public String desempilhar() {
        if (vazia()) {
            System.out.println("Erro: A pilha está vazia");
            return null;
        }
        return elementos[topo--];
    }
}