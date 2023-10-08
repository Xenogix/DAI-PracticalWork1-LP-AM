package ch.heigvd.converters;

import ch.heigvd.abstractions.IConverterBase;
import ch.heigvd.parameters.XMLToJsonParameters;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

/**
 * Class to convert an XML file to a Json file
 */
public class XMLToJsonConverter implements IConverterBase<XMLToJsonParameters> {
    /**
     * @see IConverterBase
     */
    @Override
    public void Convert(String inputFile, String outputFile, XMLToJsonParameters parameters) throws IOException {

        // Create an instance of ObjectMapper for XML
        XmlMapper xmlMapper = new XmlMapper();

        // Read XML from a file and convert it to JsonNode
        JsonNode rootNode = xmlMapper.readTree(new File(inputFile));

        // Create an instance of ObjectMapper for JSON
        ObjectMapper jsonMapper = new ObjectMapper();

        // Convert the JsonNode to a JSON string and write it to a file
        jsonMapper.writeValue(new File(outputFile), rootNode);
    }
}
