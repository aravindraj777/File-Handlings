package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ReadXMLFiles {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        String filePath = ".\\src\\xml\\employees.xml";
        ReadXMLLogic.readXML(filePath);
    }
}
