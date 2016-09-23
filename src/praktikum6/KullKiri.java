package praktikum6;

public class KullKiri {
	public static void main(String[] args) {

		int kasutajaArvamus = ArvuVahemik.kasutajaSisestus("Kull (0) või kiri (1)?", 0, 1);
		int myndivise = ArvuVahemik.suvalineArv(0,1);

		System.out.println("Kasutaja sisestas: " + kasutajaArvamus);
		System.out.println("Arvuti sisestas: " + myndivise);
	if (kasutajaArvamus == myndivise) {
		System.out.println("Arvasid ära");
	} else {
		System.out.println("Mööda panid");
	}
	}

}
