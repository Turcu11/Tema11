
public class main {

	public static void main(String[] args) {

		Persoana p1 = new Persoana("Batman");
		Persoana p2 = new Persoana("Iohanis");
		Persoana p3 = new Persoana("SuperMan");
		Mesaj m = new Mesaj("Hello there", p1, p2);
		Transmiter posta = new Posta(2);
		Transmiter email = new Email();

		System.out.println(m.toString());

		p1.trimiteMesaj("Neata buna !", p3);
		p1.setTransmiter(posta);

	}

}
