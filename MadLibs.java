import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MadLibs {

	public static void main(String[] args) throws IOException {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		BufferedReader br = new BufferedReader(new FileReader("verbs.txt"));
		
		ArrayList <String> verbs = new ArrayList <String>( );
		while (br.ready() == true)
		{
			String newVerb = "";
			char next = (char)br.read();
			
			if (next == ' ')
			{
				verbs.add(newVerb);
				newVerb = "";
			}
			else
			{
				newVerb+= next;
			}
		}
		
		System.out.println (verbs);
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
	}

}
