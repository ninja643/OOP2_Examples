package iostreams;

import java.io.*;
import java.net.MalformedURLException;

public class DownloadDemo
{
	public static void main(String[] args) throws IOException
	{
		final FileManager manager = new FileManager();
		final String link = "http://nasport.pmf.ni.ac.rs/materijali/2811/L01%20-%20Logovanje.pdf";

		manager.download(link, "downloads/f1.pdf");
		manager.copy("large.dat", "downloads/large.dat");
	}
}
