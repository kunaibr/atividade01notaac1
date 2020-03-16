package br.facens.atividade01_ac1.model;

/**
 * Produto
 */
public class Produto {
   private int codigo;
   private String nome;
   private double valor;
   private int estoque;

   public Produto(int codigo, String nome, double valor, int estoque) {
       this.codigo = codigo;
       this.nome = nome;
       this.valor = valor;
       this.estoque = estoque;
   }

   public int getCodigo() {
       return codigo;
   }

   public void setCodigo(int codigo) {
       this.codigo = codigo;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public double getValor() {
       return valor;
   }

   public void setValor(double valor) {
       this.valor = valor;
   }

   public int getEstoque() {
       return estoque;
   }

   public void setEstoque(int estoque) {
       this.estoque = estoque;
   }

   @Override
   public String toString() {
       return "Produto [codigo=" + codigo + ", estoque=" + estoque + ", nome=" + nome + ", valor=" + valor + "]";
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + codigo;
       result = prime * result + estoque;
       result = prime * result + ((nome == null) ? 0 : nome.hashCode());
       long temp;
       temp = Double.doubleToLongBits(valor);
       result = prime * result + (int) (temp ^ (temp >>> 32));
       return result;
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       Produto other = (Produto) obj;
       if (codigo != other.codigo)
           return false;
       if (estoque != other.estoque)
           return false;
       if (nome == null) {
           if (other.nome != null)
               return false;
       } else if (!nome.equals(other.nome))
           return false;
       if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
           return false;
       return true;
   }
   
   
    
}