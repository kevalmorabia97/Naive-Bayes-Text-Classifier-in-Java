import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class NBClassifier {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Data/stopwords.data"));
		HashSet<String> stopwords = new HashSet<>();
		String s;
		while((s = br.readLine())!=null)	stopwords.add(s);
		br.close();
		
		br = new BufferedReader(new FileReader("Data/Vocab.data"));
		HashMap<Integer,String> vocab = new HashMap<>();
		HashSet<Integer> stopwordsInt = new HashSet<>();
		int i = 0;
		while((s = br.readLine())!=null) {
			if(stopwords.contains(s))	stopwordsInt.add(i);	
			vocab.put(i, s);
			i++;
		}
		br.close();
		
		br = new BufferedReader(new FileReader("Data/train.data"));
		while((s = br.readLine())!=null) {
			
		}
		br.close();
		
		br = new BufferedReader(new FileReader("Data/test.data"));
		
		br.close();
	}
}
