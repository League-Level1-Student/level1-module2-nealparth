
public class TeaMakerRunner {

	public static void main(String[] args) {

		TeaBag teabag = new TeaBag("Green");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();

		teabag.getFlavor();

		kettle.boil();

		cup.makeTea(teabag, kettle.getWater());

	}

}
