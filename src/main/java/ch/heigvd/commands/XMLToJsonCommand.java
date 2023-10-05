package ch.heigvd.commands;

import ch.heigvd.converters.XMLToJsonConverter;
import ch.heigvd.parameters.XMLToJsonParameters;
import picocli.CommandLine;

@CommandLine.Command(name = "XMLToJson", version = "XMLToJson 0.1", mixinStandardHelpOptions = true)
public class XMLToJsonCommand implements Runnable  {
    @CommandLine.Option(names = { "-f", "--file" }, paramLabel = "File", description = "XML file to process")
    String inputFile;

    @CommandLine.Option(names = { "-o", "--output" }, paramLabel = "Output", description = "Json file to output")
    String outputFile;

    @Override
    public void run() {
        boolean wasSuccessful = executeConversion();
    }

    public boolean executeConversion() {
        XMLToJsonParameters parameters = new XMLToJsonParameters();
        XMLToJsonConverter converter = new XMLToJsonConverter();
        System.out.println("Everything went as excepted in XML to Json");
        return false;
    }
}
