package basics.chaitanya;

public class PersonalHabits extends LivingThings {

	public void classificationOfHabits(String livingbeing) {
		
		System.out.println("Special habits to "+ livingbeing +" is/are: ");
		if (livingbeing == "Dogs") {
			super.dogHabits();
		} else if (livingbeing == "Humans") {
			super.humanHabits();
		} else if (livingbeing == "Lions") {
			super.lionHabits();
		} else if (livingbeing == "parrots") {
			super.parrotHabits();
		}
	}
}
