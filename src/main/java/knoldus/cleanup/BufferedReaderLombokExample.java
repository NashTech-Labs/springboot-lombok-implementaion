package knoldus.cleanup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import lombok.Cleanup;

/**
 * The type Buffered reader lombok example.
 */
public class BufferedReaderLombokExample {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 * @throws IOException the io exception
	 */
	public static void main(String[] args) throws IOException {
		@Cleanup
		FileReader fr = new FileReader("sample.txt");
		
		@Cleanup
		BufferedReader br = new BufferedReader(fr);
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
	}
}
