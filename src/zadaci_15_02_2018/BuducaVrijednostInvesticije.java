package zadaci_15_02_2018;

public class BuducaVrijednostInvesticije {
	public static double vrijednostInvesticije(double iznosInvesticije, double godInteresnaStopa, int brojGodina){
		return iznosInvesticije * Math.pow((1 + (godInteresnaStopa/100) / 12), brojGodina * 12);
	}
	public static void main(String[] args) {
		double buducaVrijednostInvesticije = vrijednostInvesticije(1000, 3.25, 1);
		System.out.println(buducaVrijednostInvesticije);

	}

}
