
public class HandySurf {

	public static void main(String[] args) {
		Smurf handysmurf = new Smurf("HandySmurf");
		Smurf papasmurf = new Smurf("PapaSmurf");
		Smurf smurfette = new Smurf("Smurfette");

		handysmurf.eat();
		handysmurf.getName();

		papasmurf.getHatColor();
		papasmurf.isGirlOrBoy();
		papasmurf.getName();

		smurfette.getHatColor();
		smurfette.isGirlOrBoy();
		smurfette.getName();
	}
}
