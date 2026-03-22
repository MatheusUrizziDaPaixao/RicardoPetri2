public class PilhaDinamica implements PilhaOperacoes {
    private No topo;

    // Inicializa
    public PilhaDinamica() {
        this.topo = null;
        System.out.println("Pilha dinâmica criada");
    }

    @Override
    public boolean vazia() {
        return (topo == null);
    }

    @Override
    public boolean cheia() {
        return false;
    }

    @Override
    public void empilhar(String x) {
        No novoNo = new No(x);
        novoNo.setProx(topo);
        topo = novoNo;
        System.out.println("Elemento " + x + " adicionado à pilha.");
    }

    @Override
    public String desempilhar() {
        if (vazia()) {
            System.out.println("Erro: a pilha está vazia");
            return null;
        }
        String valor = topo.getConteudo();
        topo = topo.getProx();
        return valor;
    }
}