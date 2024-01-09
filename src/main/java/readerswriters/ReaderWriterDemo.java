package readerswriters;

import java.io.*;

public class ReaderWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		final TextFileManager manager = new TextFileManager();
//		manager.printFile("file1.txt");
//		manager.copy("file1.txt", "downloads/file1copy.txt");
//		manager.saveString("Ево једног ћириличног низа", "downloads/cirilica.txt");

		try(final InputStream is = new FileInputStream("file1.txt"))
		{
			manager.readCharsFromInputStream(is);
		}

	}
}
