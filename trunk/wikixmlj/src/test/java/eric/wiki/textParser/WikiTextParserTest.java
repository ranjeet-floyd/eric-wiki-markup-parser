package eric.wiki.textParser;

import edu.jhu.nlp.util.FileUtil;
import edu.jhu.nlp.wikipedia.WikiTextParser;

public class WikiTextParserTest extends TestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: Parser <WIKI-FILE>");
			System.exit(-1);
		}
		String wikiFile = args[0];
		String wikiText = FileUtil.readFile(wikiFile);
		WikiTextParser wtp = new WikiTextParser(wikiText);
		for(String link : wtp.getLinks()) {
			System.out.println(link);
		}	
	}
}
