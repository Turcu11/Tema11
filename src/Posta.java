
public class Posta extends Transmiter implements TransmiterInterface {

	private Mesaj[] stocare;
	private int nrCorespondenta;

	public Posta(int capacitateCorespondenta) {
		stocare = new Mesaj[capacitateCorespondenta];
		nrCorespondenta = 0;
	}

	@Override
	public void stocheaza(Mesaj mesaj) {
		if (nrCorespondenta == stocare.length) {
			for (int i = 0; i < stocare.length; i++) {
				Persoana destinatar = stocare[i].getDestinatar();
				destinatar.notify();
			}
			nrCorespondenta = 0;
		}
	}

	@Override
	public Mesaj primesteMesaj(Persoana destinatar) {
		for (int i = 0; i < stocare.length; i++) {
			if (stocare[i].getDestinatar().equals(destinatar))
				return stocare[i];
		}
		return null;
	}

}
