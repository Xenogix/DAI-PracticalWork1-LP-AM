package ch.heigvd.commands;

import ch.heigvd.converters.XMLToJsonConverter;
import ch.heigvd.parameters.FileIOParameters;
import ch.heigvd.parameters.XMLToJsonParameters;
import picocli.CommandLine;

import java.io.IOException;

/**
 * Class to execute the XML-to-JSON conversion command
 */
@CommandLine.Command(name = "XMLToJson", version = "XMLToJson 0.1", mixinStandardHelpOptions = true)
public class XMLToJsonCommand implements Runnable  {

    @CommandLine.Mixin
    private FileIOParameters fileIOParameters;

    @CommandLine.Mixin
    private  XMLToJsonParameters xmlToJsonParameters;

    /**
     * Call the method to execute the command and display if it was successful or not.
     */
    @Override
    public void run() {
        boolean wasSuccessful = executeConversion();
        if(!wasSuccessful) System.out.println("The conversion from XML to Json failed unexpectedly");
        else System.out.println("The conversion from XML to Json was done successfully");
    }

    /**
     * Execute the command
     *
     * @return true if the conversion was successful
     */
    public boolean executeConversion() {
        try {
            XMLToJsonConverter converter = new XMLToJsonConverter();
            converter.Convert(fileIOParameters.inputFile, fileIOParameters.outputFile, xmlToJsonParameters);
            return true;
        }
        catch (IOException ioException) {
            System.out.println(ioException.getMessage());
            return false;
        }
    }
}
