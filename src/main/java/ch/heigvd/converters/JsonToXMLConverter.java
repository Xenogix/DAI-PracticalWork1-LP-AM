package ch.heigvd.converters;

import ch.heigvd.abstractions.IConverterBase;
import ch.heigvd.parameters.JsonToXMLParameters;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;

/**
 * Class to convert a Json file to an XML file
 */
public class JsonToXMLConverter implements IConverterBase<JsonToXMLParameters> {
    /**
     * @see IConverterBase
     */
    @Override
    public void Convert(String inputFile, String outputFile, JsonToXMLParameters parameters) throws IOException {
        // Create an instance of ObjectMapper for JSON
        ObjectMapper jsonMapper = new ObjectMapper();

        // Read JSON from a file and convert it to JsonNode
        JsonNode jsonTree = jsonMapper.readTree(new File(inputFile));

        // Create an instance of XmlMapper for XML and configure indentation and info
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);

        // Convert to Xml file
        xmlMapper.writeValue(new File(outputFile), jsonTree);
    }
}
