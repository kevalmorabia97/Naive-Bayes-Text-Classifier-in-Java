import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NBClassifier {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Data/train.data"));
		
		br.close();
	}
}
