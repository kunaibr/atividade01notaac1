package br.facens.atividade01_ac1.service;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Map.Entry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.facens.atividade01_ac1.model.Produto;
import br.facens.atividade01_ac1.repository.ProdutoRepository;

/**
 * ProdutoService
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    public Produto getProduto (Integer id)
    {
        Produto produto = pr.getProdutoByID(id);
         if(produto != null)
         {
            if(produto.getCodigo()!=id)
            {
                produto = null;
            }
         }
         return produto;
    }

    public ArrayList <Produto> getProdutosEmEstoque()
    {
        ArrayList <Produto> pList = new ArrayList<>();
        Iterator <Entry<Integer,Produto>> iterator = pr.p.entrySet().iterator();
        while (iterator.hasNext())
        {
            Entry<Integer,Produto> aux = iterator.next();
            if(aux.getValue().getEstoque()>0)
            {
                 pList.add(aux.getValue());
            }
        }
       return pList;
    }

    
    public ArrayList <Produto> getProdutosByValorAcima(double valor)
    {
        ArrayList <Produto> pList = new ArrayList<>();
        Iterator <Entry<Integer,Produto>> iterator = pr.p.entrySet().iterator();
        while (iterator.hasNext())
        {
            Entry<Integer,Produto> aux = iterator.next();
            if(aux.getValue().getValor()>valor)
            {
                 pList.add(aux.getValue());
            }
        }
       return pList;
    }

    public ArrayList <Produto> getProdutosByValorAbaixo(double valor)
    {
        ArrayList <Produto> pList = new ArrayList<>();
        Iterator <Entry<Integer,Produto>> iterator = pr.p.entrySet().iterator();
        while (iterator.hasNext())
        {
            Entry<Integer,Produto> aux = iterator.next();
            if(aux.getValue().getValor()<valor)
            {
                 pList.add(aux.getValue());
            }
        }
       return pList;
    }


}