public class HarryPotter {

	private boolean cloakOn;

	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing a funny dance and drinking butter beer.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter theboywholived = new HarryPotter();
		// 2. become invisible
		theboywholived.makeInvisible(true);
		// 3. spy on professor trashcan
		theboywholived.spyOnSnape();
		// 4. become visible again
		theboywholived.makeInvisible(false);
		// 5. cast a “stupid ” spell
		theboywholived.castSpell("stupid fly. i gonna eat you");
	}

}
