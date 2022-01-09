package behavioral.memento;

// Originator class
// will work with information about a human adn save his condition
class Human
{
	private String name;
	private String surname;
	private int age;
	public Human(String pName, String pSurname, int pAge)
	{
		name = pName;
		surname = pSurname;
		age = pAge;
	}
	public Human() {
		this("Oleg", "Kukushkin", 25);
	}

	public String GetName(){
		return name;
	}
	public void SetName(String pName){
		name = pName;
	}

	public String GetSurname(){
		return surname;
	}
	public void SetSurname(String pSurname){
		surname = pSurname;
	}
	public int GetAge(){
		return age;
	}
	public void SetAge(int pAge){
		age = pAge;
	}
	// getting a moment of condition
	public Memento SaveMemento(){
		System.out.print("\nSaving state\n");
		return new Memento(name, surname, age);
	}
	// restoring a condition
	public void RestoreMemento(Memento pMemento)
	{
		System.out.print("\nRestoring state\n");
		name = pMemento.GetName();
		surname = pMemento.GetSurname();
		age = pMemento.GetAge();
	}
}