
public class Mesaj {
	protected String continut;
	protected Persoana expeditor;
	protected Persoana destinatar;

	public Mesaj(String continut, Persoana expeditor, Persoana destinatar) {
		this.continut = continut;
		this.expeditor = expeditor;
		this.destinatar = destinatar;
	}

	public String getContinut() {
		return continut;
	}

	public void setContinut(String continut) {
		this.continut = continut;
	}

	public Persoana getExpeditor() {
		return expeditor;
	}

	public void setExpeditor(Persoana expeditor) {
		this.expeditor = expeditor;
	}

	public Persoana getDestinatar() {
		return destinatar;
	}

	public void setDestinatar(Persoana destinatar) {
		this.destinatar = destinatar;
	}

	@Override
	public String toString() {
		return "Mesaj [continut=" + continut + ", expeditor=" + expeditor + ", destinatar=" + destinatar + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesaj other = (Mesaj) obj;
		if (continut == null) {
			if (other.continut != null)
				return false;
		} else if (!continut.equals(other.continut))
			return false;
		if (destinatar == null) {
			if (other.destinatar != null)
				return false;
		} else if (!destinatar.equals(other.destinatar))
			return false;
		if (expeditor == null) {
			if (other.expeditor != null)
				return false;
		} else if (!expeditor.equals(other.expeditor))
			return false;
		return true;
	}

}
