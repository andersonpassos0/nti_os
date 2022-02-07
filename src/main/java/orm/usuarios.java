package orm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuarios;
	private String user;
	private String pass;
	private String name;
	private String email;
	private int tipo;
	private int fkTecnico;
	private String codigo;
	private String status;
	private String DsTelefone;
//	private Date DtNascimento;
//	private String acesso;
	private String anexo;
	private String location;
	
	
	public Integer getIdusuarios() {
		return idusuarios;
	}
	public void setIdusuarios(Integer idusuarios) {
		this.idusuarios = idusuarios;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getFkTecnico() {
		return fkTecnico;
	}
	public void setFkTecnico(int fkTecnico) {
		this.fkTecnico = fkTecnico;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDsTelefone() {
		return DsTelefone;
	}
	public void setDsTelefone(String dsTelefone) {
		DsTelefone = dsTelefone;
	}
//	public Date getDtNascimento() {
//		return DtNascimento;
//	}
//	public void setDtNascimento(Date dtNascimento) {
//		DtNascimento = dtNascimento;
//	}
//	public String getAcesso() {
//		return acesso;
//	}
//	public void setAcesso(String acesso) {
//		this.acesso = acesso;
//	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
