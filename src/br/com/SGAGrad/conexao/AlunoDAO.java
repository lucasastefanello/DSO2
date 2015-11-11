package br.com.SGAGrad.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.SGAGrad.model.Aluno;

@ManagedBean
public class AlunoDAO {

	private Connection con;//objeto connection que será usado nos métodos abaixo

	/*
	 * Construtor que recebe como parametro uma conexao com o banco de dado. 
	 */
	public AlunoDAO(Connection con){
		this.con = con;
	}

	public void cadastrar(Aluno aluno) throws Exception {
		PreparedStatement p =
				con.prepareStatement("insert into aluno (nome, idade, cpf, data, professor, laboratorio, formacao, proeficiencia, exameQualificacao, defesa) values (?,?,?,?,?,?,?,?,?,?)");
		p.setString(1, aluno.getNome());
		p.setInt(2, aluno.getIdade());
		p.setString(3, aluno.getCpf());
		p.setString(4, aluno.getData());
		p.setString(5, aluno.getProfessor());
		p.setString(6, aluno.getLaboratorio());
		p.setString(7, aluno.getFormacao());
		p.setString(8, aluno.getProeficiencia());
		p.setString(9, aluno.getExameQualificacao());
		p.setString(10, aluno.getDefesa());
		p.executeUpdate();
		p.close();
	}

	public void deletar(Aluno aluno) throws Exception {
		PreparedStatement p = con.prepareStatement("delete from aluno where nome = ?");
		p.setString(1, aluno.getNome());
		p.executeUpdate();
		p.close();
	}

	public void update(Aluno aluno) throws Exception {
		PreparedStatement p = 
				con.prepareStatement("update aluno set nome = ?, cpf = ? where nome = ?");
		p.setString(1, aluno.getNome());
		p.setString(2, aluno.getCpf());
		p.executeUpdate();
		p.close();
	}

	public List<Aluno> listarTodos() throws Exception{
		List<Aluno> alunos = new ArrayList<Aluno>();
		PreparedStatement p = con.prepareStatement("select * from aluno");
		ResultSet rs = p.executeQuery();
		while(rs.next()){
			Aluno aluno = new Aluno();
			aluno.setNome(rs.getString("nome"));
			aluno.setCpf(rs.getString("cpf"));
			alunos.add(aluno);
		}
		rs.close();
		p.close();
		return alunos;
	}

}
