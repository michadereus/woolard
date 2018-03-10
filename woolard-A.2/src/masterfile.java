import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class masterfile {
	public static void main(String[] args) throws FileNotFoundException {
		harbor harb = new harbor(1);
		harb.readForeclosure();
		harb.masterBuilder();
	}

}