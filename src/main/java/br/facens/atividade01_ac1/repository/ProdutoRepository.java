package br.facens.atividade01_ac1.repository;
import br.facens.atividade01_ac1.model.Produto;
import org.springframework.stereotype.Repository;
import java.util.HashMap;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> p = new HashMap<Integer,Produto>();

    public ProdutoRepository()
    {
        // Todos os produtos estão com estoque, porém caso alterado
        // não será mostrado na view produtos em estoque
        // assim como em qualquer serviço chamado, haverá o filtro feito pela service
        p.put(0,new Produto(0,"Celular",500.00 ,20));
        p.put(1,new Produto(1,"Televisao",300.00 ,10));
        p.put(2,new Produto(2,"Computador",400.00 ,15));
        p.put(3,new Produto(3,"Geladeira",300.00 ,10));
        p.put(4,new Produto(4,"Microondas",200.00 ,25));
        p.put(5,new Produto(5,"Maquina de Lavar",100.00 ,12));
        p.put(6,new Produto(6,"Fogao",250.00 ,18));
        p.put(7,new Produto(7,"Ferro de Passar",150.00 ,19));
        p.put(8,new Produto(8,"Liquidificador",180.00 ,16));
        p.put(9,new Produto(9,"Ventilador",80.00 ,30));
    }

    public Produto getProdutoByID(Integer id)
    {
        return p.get(id);
    }

}