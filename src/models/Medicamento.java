package models;

public class Medicamento {
    private Long id;
    private String Nome;
    private String laboratorioFabricante;
    private String principioAtivo;  
    private Doenca doenca;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.Nome;
    }


    public void setNome(String Nome) {
        this.Nome = Nome;
    }


    public Medicamento Nome(String Nome) {
        setNome(Nome);
        return this;
    }


    public String getLaboratorioFabricante() {
        return this.laboratorioFabricante;
    }


    public void setLaboratorioFabricante(String laboratorioFabricante) {
        this.laboratorioFabricante = laboratorioFabricante;
    }


    public Medicamento laboratorioFabricante(String laboratorioFabricante) {
        setLaboratorioFabricante(laboratorioFabricante);
        return this;
    }


    public String getPrincipioAtivo() {
        return this.principioAtivo;
    }


    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }


    public Medicamento principioAtivo(String principioAtivo) {
        setPrincipioAtivo(principioAtivo);
        return this;
    }


    public Doenca getDoenca() {
        return this.doenca;
    }


    public void setDoenca(Doenca doenca) {
        this.doenca = doenca;
    }


    public Medicamento doenca(Doenca doenca) {
        setDoenca(doenca);
        return this;
    }
}
