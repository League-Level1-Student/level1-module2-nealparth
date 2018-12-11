
public class Spongebob {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");

		spongebob.eat();
		spongebob.laugh();

		patrick.eat();
		patrick.laugh();
		patrick.getName();

		squidward.eat();
		squidward.laugh();
		squidward.getName();
	}
}
