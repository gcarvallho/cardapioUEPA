package model;

public class Lanchonete{//nome dos atributos tem que ser iguais os do tabela no banco
   private String nome_l;
   private String cnpj_l;
   private String responsavel_l;

   public Lanchonete(){
       //Construtor vazio
   }
   //METODOS GET E SET

    public String getNome_l() {
        return nome_l;
    }

    public void setNome_l(String nome_l) {
        this.nome_l = nome_l;
    }

    public String getCnpj_l() {
        return cnpj_l;
    }

    public void setCnpj_l(String cnpj_l) {
        this.cnpj_l = cnpj_l;
    }

    public String getResponsavel_l() {
        return responsavel_l;
    }

    public void setResponsavel_l(String responsavel_l) {
        this.responsavel_l = responsavel_l;
    }
}
