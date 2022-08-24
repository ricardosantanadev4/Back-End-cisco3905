package br.com.cisco3905.cisco3905.model;

import java.util.Objects;

public class Ramal {
	private Long id;
	private String ramal;
	private String serial;
	private String ip;

//	construtor padrao
	public Ramal() {
		super();
		// TODO Auto-generated constructor stub
	}

//	construtor selecioando os atributos   generate constructor using fields
	public Ramal(Long id, String ramal, String serial, String ip) {
		super();
		this.id = id;
		this.ramal = ramal;
		this.serial = serial;
		this.ip = ip;
	}

//	getters / setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

//	toString() hashCode() e equals()
	@Override
	public String toString() {
		return "Ramal [id=" + id + ", ramal=" + ramal + ", serial=" + serial + ", ip=" + ip + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ip, ramal, serial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ramal other = (Ramal) obj;
		return Objects.equals(id, other.id) && Objects.equals(ip, other.ip) && Objects.equals(ramal, other.ramal)
				&& Objects.equals(serial, other.serial);
	}

}
