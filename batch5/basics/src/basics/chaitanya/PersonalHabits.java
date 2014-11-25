package basics.chaitanya;

public class PersonalHabits extends LivingThings {

	public void dogHabits() {
		System.out.println("Dog has a habit of barking");
	}

	void humanHabits() {
		System.out.println("Human has a habit of thinking unlike to an animal");
	}

	void lionHabits() {
		System.out.println("Lion has a habit of Hunting");
	}

	void parrotHabits() {
		System.out.println("Parrot has a habit of flying");
	}

	public void classificationOfHabits(String livingbeing) {

		LivingThings attribute = new LivingThings();
		attribute.commonThings();

		PersonalHabits habits = new PersonalHabits();

		if (livingbeing == "Dog") {
			habits.dogHabits();
		} else if (livingbeing == "Human") {
			habits.humanHabits();
		} else if (livingbeing == "Lion") {
			habits.lionHabits();
		} else if (livingbeing == "parrot") {
			habits.parrotHabits();
		}
	}
}
