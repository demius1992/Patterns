package behavioral.memento;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			// an object of human creation
			Human h = new Human("Piter", "Dymos", 44);

			MemoryState obj = new MemoryState();

			// saving a condition
			obj.SetMemento(h.SaveMemento());
			// changing data
			h.SetSurname("Dixy");
			h.SetName("Oliver");
			h.SetAge(45);
			
			// restoring a condition
			h.RestoreMemento(obj.GetMemento());
			
			System.out.printf("\n%s %s %d\n",h.GetName(), h.GetSurname(),h.GetAge());
			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
