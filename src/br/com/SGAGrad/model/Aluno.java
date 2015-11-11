package br.com.SGAGrad.model;

public class Aluno {
	
	private String nome;
    private int idade;
    private String cpf;
    private String data;
    private String professor;
    private String laboratorio;
    private String formacao;
    private String proeficiencia;
    private String exameQualificacao;
    private Artigo artigo = new Artigo();
    private Artigo artigo2 = new Artigo();
    private Artigo artigoperiodico = new Artigo();
    private Artigo artigoperiodico2 = new Artigo();
    private Estagio estagio = new Estagio();
    private String defesa;
    
    public Aluno(){}

    public Artigo getArtigoperiodico() {
        return artigoperiodico;
    }

    public void setArtigoperiodico(Artigo artigoperiodico) {
        this.artigoperiodico = artigoperiodico;
    }

    public Artigo getArtigoperiodico2() {
        return artigoperiodico2;
    }

    public void setArtigoperiodico2(Artigo artigoperiodico2) {
        this.artigoperiodico2 = artigoperiodico2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getProeficiencia() {
        return proeficiencia;
    }

    public void setProeficiencia(String proeficiencia) {
        this.proeficiencia = proeficiencia;
    }

    public String getExameQualificacao() {
        return exameQualificacao;
    }

    public void setExameQualificacao(String exameQualificacao) {
        this.exameQualificacao = exameQualificacao;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public Estagio getEstagio() {
        return estagio;
    }

    public void setEstagio(Estagio estagio) {
        this.estagio = estagio;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public Artigo getArtigo2() {
        return artigo2;
    }

    public void setArtigo2(Artigo artigo2) {
        this.artigo2 = artigo2;
    }

}
