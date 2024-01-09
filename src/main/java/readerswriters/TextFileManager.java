package readerswriters;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextFileManager
{
	public void printFile(final String fileName) throws IOException
	{
		try (final Reader reader = new BufferedReader(new FileReader(fileName)))
		{
			int c;
			while ((c = reader.read()) != -1)
			{
				System.out.println(c);
			}
		}
	}

	public void copy(final String inputFileName, final String outputFileName) throws IOException
	{
		try (final Reader reader = new BufferedReader(new FileReader(inputFileName));
			 final Writer writer = new BufferedWriter(new FileWriter(outputFileName)))
		{
			int c;
			while ((c = reader.read()) != -1)
			{
				writer.write(c);
			}
		}
	}

	public void saveString(final String value, final String outputFileName) throws IOException
	{
		try (final Reader reader = new BufferedReader(new StringReader(value));
			 final Writer writer = new BufferedWriter(new FileWriter(outputFileName)))
		{
			int c;
			while ((c = reader.read()) != -1)
			{
				writer.write(c);
			}
		}
	}

	public void readCharsFromInputStream(final InputStream is) throws IOException
	{
		try(final Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8))
		{
			int c;
			while ((c = reader.read()) != -1)
			{
				System.out.println(c);
			}
		}
	}
}
