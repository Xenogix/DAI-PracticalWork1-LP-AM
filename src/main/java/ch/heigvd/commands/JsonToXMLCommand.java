package ch.heigvd.commands;

import ch.heigvd.converters.JsonToXMLConverter;
import ch.heigvd.parameters.JsonToXMLParameters;
import picocli.CommandLine;

@CommandLine.Command(name = "JsonToXML", version = "JsonToXML 0.1", mixinStandardHelpOptions = true)
public class JsonToXMLCommand implements Runnable  {
    @CommandLine.Option(names = { "-f", "--file" }, paramLabel = "File", description = "JSON file to process")
    String inputFile;

    @CommandLine.Option(names = { "-o", "--output" }, paramLabel = "Output", description = "XML file to output")
    String outputFile;

    @Override
    public void run() {
        boolean wasSuccessful = executeConversion();
    }

    public boolean executeConversion() {
        JsonToXMLParameters parameters = new JsonToXMLParameters();
        JsonToXMLConverter converter = new JsonToXMLConverter();
        System.out.println("Everything went as excepted in Json to XML");
        return false;
    }
}
