package br.edu.utfpr.pb.projetoSeguranca.audit;


public interface GeneroAud {

    Integer getId();

    String getNome();

    Integer getTipoTransacao();

    Integer getCreatedBy();

    Integer getModifiedBy();

}
