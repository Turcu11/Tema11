
public class Persoana {

	protected String nume;

	public Persoana(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoana other = (Persoana) obj;
		if (nume == null) {
			if (other.nume != null)
				return false;
		} else if (!nume.equals(other.nume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + "]";
	}

	public Mesaj trimiteMesaj(String continut, Persoana destinatar) {
		return new Mesaj(continut, this, destinatar);
	}

	public Class<? extends Persoana> setTransmiter(Transmiter transmiter) {
		return this.getClass();
	}

}
