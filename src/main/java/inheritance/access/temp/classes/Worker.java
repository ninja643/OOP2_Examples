package inheritance.access.temp.classes;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Worker
{
	private final String name;

	public static Worker createAndRegisterInstance(final String name, final WorkerManager workerManager)
	{
		Worker worker = new Worker(name);
		workerManager.addWorker(worker);
		System.out.println("Initializing worker");
		worker.longInitializationProcess();
		System.out.println("Worker initialized");
		return worker;
	}

	private Worker(final String name)
	{
		this.name = name;
	}

	private void longInitializationProcess()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
}
