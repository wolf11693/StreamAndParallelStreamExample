package it.progr.stream;

public class Persona implements Comparable<Persona> {
	private String nome;
	private String cognome;
	private String luogoNascita;

	public Persona(String nome, String cognome, String luogoNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((luogoNascita == null) ? 0 : luogoNascita.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (luogoNascita == null) {
			if (other.luogoNascita != null)
				return false;
		} else if (!luogoNascita.equals(other.luogoNascita))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona o) {
		String persona1 = this.nome.trim().concat(this.cognome).trim().concat(this.luogoNascita).trim();
		String persona2 = o.nome.trim().concat(o.cognome).trim().concat(o.luogoNascita).trim();
		
		return persona1.compareTo(persona2);
	}

	@Override
	public String toString() {
		return "Persona:[nome=" + nome + ", cognome=" + cognome + ", luogoNascita=" + luogoNascita + "]; ";
	}

}