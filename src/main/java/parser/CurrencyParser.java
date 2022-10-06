package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CurrencyParser {
    private static final String URL = "https://minfin.com.ua/ua/currency/auction/exchanger/usd/buy/kiev/";
    private static final String xPath = "//div[@class='sale']/span";

    public String getCurrentCurrentUSD() {
        var doc = getDocument(URL);
        var value =  doc.selectXpath(xPath).text();
        return value.split(" ")[0];
    }

    private Document getDocument(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }
}
