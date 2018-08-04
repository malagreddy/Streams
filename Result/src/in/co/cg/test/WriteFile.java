package in.co.cg.test;
// write random numbers into a file
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	private String path;
	private boolean append_to_file = false;

	public WriteFile(String filePath, boolean append_value) {
		path = filePath;
		append_to_file = append_value;
	}

	public void writeToFile(String textLine) throws IOException {
		FileWriter write = new FileWriter(path, append_to_file);
		PrintWriter printLine = new PrintWriter(write);
		printLine.printf("%s" + "%n", textLine);
		printLine.close();
	}

}