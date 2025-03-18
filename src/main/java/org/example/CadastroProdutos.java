import java.util.HashMap;
import java.util.Map;

public class CadastroProdutos {
    private Map<Integer, Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashMap<>();
    }

    public void cadastrarProduto(int codigo, String nome, double preco) {
        if (produtos.containsKey(codigo)) {
            System.out.println("Erro: Já existe um produto com esse código.");
        } else {
            Produto produto = new Produto(codigo, nome, preco);
            produtos.put(codigo, produto);
            System.out.println("Produto cadastrado com sucesso!");
        }
    }

    public Produto buscarProduto(int codigo) {
        return produtos.get(codigo);
    }
}