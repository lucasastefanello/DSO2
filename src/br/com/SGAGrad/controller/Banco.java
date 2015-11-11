package br.com.SGAGrad.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.SGAGrad.model.Aluno;

@ManagedBean(name="BancoAlunos")
public class Banco {
	
	private static List<Aluno> alunos = new ArrayList<>();
    private static Banco bd = new Banco();
    
    private Banco(){};

    public static List<Aluno> getAlunos() {
        return alunos;
    }
    
    public static void setAlunos(List<Aluno> alunos) {
        Banco.alunos = alunos;
    }
    
    public static Banco getInstance(){
        return Banco.bd;
    };
    
    public Aluno getByCpf(String cpf){
        Aluno ret = new Aluno();
        for(Aluno a : Banco.alunos){
            if(a.getCpf().equals(cpf)){
                ret = a;
            }
        }
        
        return ret;
    }
    
    public Boolean verificaSeCadastrado(Aluno aluno){
        for(Aluno a : Banco.alunos){
            if(a.getCpf().equals(aluno.getCpf())){
                return true;
            }
        }
        return false;
    }
    
    public String cadastraUsuario(Aluno aluno){
        System.out.println(aluno.getNome());
        if(this.verificaSeCadastrado(aluno)){
            return "alunoCadastrado";
        } else{
            Banco.alunos.add(aluno);
            return "index";
        }
    };
    
}
