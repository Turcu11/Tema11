
public class Email extends Transmiter implements TransmiterInterface {

	private Mesaj mesaj = null;
	public static final String tipMesagerie = "Email";

	public Email() {
		super();
	}

	@Override
	public void stocheaza(Mesaj mesaj) {
		this.mesaj = mesaj;
		Persoana destinatar = mesaj.getDestinatar();
		destinatar.notify();

	}

	@Override
	public Mesaj primesteMesaj(Persoana destinatar) {
		if (destinatar.equals(mesaj.getDestinatar())) {
			return mesaj;
		}
		return null;
	}

}
