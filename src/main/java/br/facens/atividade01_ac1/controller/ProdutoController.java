package br.facens.atividade01_ac1.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.facens.atividade01_ac1.model.Produto;
import br.facens.atividade01_ac1.service.ProdutoService;

/**
 * ProdutoController
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService ps;
    
    @GetMapping("/produto/{id}")
    public ModelAndView getProduto(  @PathVariable ("id") Integer id )
    {
       ModelAndView mv = new ModelAndView("produtogpView");
       Produto produto = ps.getProduto(id);
       mv.addObject("produto", produto);
       return mv;
        
    }
    
    @GetMapping("produtosEmEstoque")
    public ModelAndView getProdutosEmEstoque()
    {
       ModelAndView mv = new ModelAndView("produtogpeView");
       ArrayList <Produto> produtos= ps.getProdutosEmEstoque();
       mv.addObject("produtos", produtos);
     
       return mv;
        
    }

    @GetMapping("produtosValorAcima/{valor}")
    public ModelAndView getProdutosByValorAcima( @PathVariable ("valor")double valor)
    {
       ModelAndView mv = new ModelAndView("produtogvacimaView");
       ArrayList <Produto> produtos= ps.getProdutosByValorAcima(valor);
       mv.addObject("produtos", produtos);
       
       return mv;
        
    }

    @GetMapping("produtosValorAbaixo/{valor}")
    public ModelAndView getProdutosByValorAbaixo( @PathVariable ("valor")double valor)
    {
       ModelAndView mv = new ModelAndView("produtogvabaixoView");
       ArrayList <Produto> produtos= ps.getProdutosByValorAbaixo(valor);
       mv.addObject("produtos", produtos);
       
       return mv;
        
    }
}
