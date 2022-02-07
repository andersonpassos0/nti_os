package orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuarios;
	
	@Column (name = "user", length = 200, nullable = false)
	private String user;
	
	@Column (name = "pass", length = 100, nullable = false)
	private String pass;

	@Column (name = "name", length = 200, nullable = false)
	private String name;

	@Column (name = "email", length = 200, nullable = false)
	private String email;
	
	private int tipo;
	
	private int fkTecnico;
	
	private String codigo;
	
	private String status;
	
	@Column (name = "DsTelefone", nullable = false)
	private String dsTelefone;
	
//	@Column (name = "DtNascimento", nullable = false)
//	private Date dtNascimento;
	
//	private String acesso;
	
	@Column (name = "anexo", length = 150, nullable = false)
	private String anexo;
	
	@Column (name = "location", length = 200, nullable = false)
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
		return dsTelefone;
	}
	public void setDsTelefone(String dsTelefone) {
		dsTelefone = dsTelefone;
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
