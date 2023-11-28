package inheritance.access.temp.classes;

import java.util.ArrayList;
import java.util.List;

public class WorkerManager
{
	private final List<Worker> activeWorkers = new ArrayList<>();

	public void addWorker(final Worker worker)
	{
		System.out.printf("Adding worker %s to list of active workers%n", worker.getName());
		activeWorkers.add(worker);
	}

	public void printWorkers()
	{
		for (Worker worker : activeWorkers)
		{
			System.out.println(worker);
		}
	}

	public static void main(String[] args)
	{
		final WorkerManager manager = new WorkerManager();

		Worker.createAndRegisterInstance("Pera", manager);
		Worker.createAndRegisterInstance("Mika", manager);

		manager.printWorkers();
	}
}
