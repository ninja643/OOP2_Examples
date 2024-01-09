package iostreams;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class FileManager
{
	public void download(final String link, final String outputFileName) throws MalformedURLException
	{
		final URL url = new URL(link);
		try (final InputStream is = url.openStream())
		{
			readStreamAndSaveToFile(is, outputFileName);
		}
		catch (final IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void readStreamAndSaveToFile(final InputStream is, final String outputFileName) throws IOException
	{
		try (final OutputStream fos = new BufferedOutputStream(new FileOutputStream(outputFileName));
			 final InputStream bis = new BufferedInputStream(is))
		{
			int b;
			while ((b = bis.read()) != -1)
			{
				fos.write(b);
			}
		}
	}

	public void copy(final String inputFileName, final String outputFileName) throws IOException
	{
		try(final InputStream is = new BufferedInputStream(new FileInputStream(inputFileName)))
		{
			readStreamAndSaveToFile(is, outputFileName);
		}
	}
}
