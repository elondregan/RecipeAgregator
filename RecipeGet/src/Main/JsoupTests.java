package Main;
import java.io.IOException;

import javax.swing.text.Document;

import org.jsoup.*;
public class JsoupTests {
	public static void main(String[] args){
		System.out.println("Some basic tests of Jsoup");
		try {
			Document test = (Document) Jsoup.connect("http://allrecipes.com/recipe/13941/").userAgent("Chrome").data("name", "jSoup").get();
		} catch (IOException e) {
			
		}
	}
}
