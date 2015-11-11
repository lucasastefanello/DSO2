package br.com.SGAGrad.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.SGAGrad.conexao.AlunoDAO;
import br.com.SGAGrad.conexao.ConexaoMySQL;
import br.com.SGAGrad.model.Aluno;
import br.com.SGAGrad.model.Artigo;
import br.com.SGAGrad.model.Estagio;

@ManagedBean
public class Controller {
	
	Aluno aluno = new Aluno();
    Artigo artigo = new Artigo();
    Estagio estagio = new Estagio();
    String cpf;
    Banco bd = Banco.getInstance();
    List<Aluno> lista = new ArrayList<>();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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
    
    public void cadastraUsuario() throws Exception{
        try {
        AlunoDAO alunoDAO = new AlunoDAO(ConexaoMySQL.createConnectionToMySQL());
    	alunoDAO.cadastrar(aluno);
        } finally {
    	System.out.println("Aluno cadastrado com sucesso!!");
        }
    }
        
    public void getAlunoByCpf(){
        Aluno a = new Aluno();
        a = bd.getByCpf(this.cpf);
        System.out.println("retornou isso ");
        System.out.println(a.getNome());
        System.out.println(a.getCpf());
    }
    
    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }
    
    public List<Aluno> getAlunos(){
        return Banco.getAlunos();
    }

}
