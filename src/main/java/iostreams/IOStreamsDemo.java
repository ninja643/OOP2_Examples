package iostreams;

import java.io.*;

public class IOStreamsDemo
{
	private static final int MAX_BUFFER_SIZE = 8 * 1024;

	private static void createBinaryBuffered(final String outputFileName, final int requiredSize)
	{
		try(final OutputStream os = new BufferedOutputStream(new FileOutputStream(outputFileName)))
		{
			for (int i = 0; i < requiredSize; i++)
			{
				os.write(i);
			}
		}
		catch (IOException e)
		{
			System.out.println("Error while creating file: " + e.getMessage());
		}
	}

	private static void createBinary(final String outputFileName, final int requiredSize)
	{
		byte[] buffer = new byte[MAX_BUFFER_SIZE];

		try (final OutputStream os = new FileOutputStream(outputFileName);)
		{
			int index = 0;
			int i = 0;
			while (i < requiredSize)
			{
				if (index == MAX_BUFFER_SIZE)
				{
					os.write(buffer, 0, index);
					index = 0;
				}
				else
				{
					buffer[index++] = (byte)i++;
				}
			}
			os.write(buffer, 0, index);
		}
		catch (IOException e)
		{
			System.out.println("Error while creating file: " + e.getMessage());
		}
	}

	private static void copyFile(final String inputFileName, final String outputFileName)
	{
		try (
			final InputStream fis = new FileInputStream(inputFileName);
			final OutputStream fos = new FileOutputStream(outputFileName))
		{
			System.out.println("Reading data...");
			int counter = 0;
			byte[] buffer = new byte[MAX_BUFFER_SIZE];
			int bytesRead = 0;

			while ((bytesRead = fis.read(buffer)) != -1)
			{
				counter++;
				fos.write(buffer, 0, bytesRead);
			}
			System.out.println("Data copied. Number of reads: " + counter);
		}
		catch (final IOException e)
		{
			e.printStackTrace();
			System.out.println("Error while copying data!");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Creating the file wiht BOS");
		long createStart = System.currentTimeMillis();
		createBinaryBuffered("large.dat", 5_000_000);
		long createEnd = System.currentTimeMillis();
		System.out.println("Done in " + (createEnd - createStart) + "ms");

		System.out.println("Creating the file with manual buffering");
		createStart = System.currentTimeMillis();
		createBinary("large1.dat", 5_000_000);
		createEnd = System.currentTimeMillis();
		System.out.println("Done in " + (createEnd - createStart) + "ms");


		System.out.println("Copying the file");
		long copyStart = System.currentTimeMillis();
		copyFile("large.dat", "large_copy.dat");
		long copyEnd = System.currentTimeMillis();
		System.out.println("Done in " + (copyEnd - copyStart) + "ms");
	}
}
