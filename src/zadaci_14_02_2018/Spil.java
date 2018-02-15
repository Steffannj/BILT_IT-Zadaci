package zadaci_14_02_2018;

public class Spil {
	public static void izvuciKartu() {
		char brojevi[] = { 'A', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'T', 'J', 'Q', 'K' };
		String znak[] = { "Karo", "Pik", "Herc", "Tref" };
		System.out.println("Izvukli ste: "
				+ brojevi[(int) (Math.random() * brojevi.length)] + " u znaku "
				+ znak[(int) (Math.random() * znak.length)]);
	}

	public static void main(String[] args) {
		izvuciKartu();

	}

}
