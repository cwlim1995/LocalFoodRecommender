import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class BlogCrawler {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
        
        for (Element headline: newsHeadlines) {
            System.out.println(headline.attr("title") + headline.absUrl("href"));
        }
    }
}