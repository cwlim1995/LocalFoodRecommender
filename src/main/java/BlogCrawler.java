import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BlogCrawler {
    private static final Logger logger = LogManager.getLogger(BlogCrawler.class);

    public static void main(String[] args) throws IOException {
        logger.trace("Entering application.");
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
        
        for (Element headline: newsHeadlines) {
            logger.debug(headline.attr("title") + headline.absUrl("href"));
        }
    }
}