package br.edu.utfpr.pb.projetoSeguranca.audit;


public interface GeneroAud {

    Integer getId();

    String getNome();

    Integer getRevtype();

    Long getCreated_By();

    Long getModified_By();

}
