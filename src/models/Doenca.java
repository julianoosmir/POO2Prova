package models;

public class Doenca {
   
    private Long id;
    private String cid;
    private String nome;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }


    public String getCID() {
        return this.cid;
    }


    public void setCID(String cid) {
        this.cid = cid;
    }


    public Doenca cid(String cid) {
        setCID(cid);
        return this;
    }


    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Doenca Nome(String Nome) {
        setNome(Nome);
        return this;
    }

}
