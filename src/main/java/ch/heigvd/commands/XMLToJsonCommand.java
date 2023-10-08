package ch.heigvd.commands;

import ch.heigvd.converters.XMLToJsonConverter;
import ch.heigvd.parameters.FileIOParameters;
import ch.heigvd.parameters.XMLToJsonParameters;
import picocli.CommandLine;

import java.io.IOException;

@CommandLine.Command(name = "XMLToJson", version = "XMLToJson 0.1", mixinStandardHelpOptions = true)
public class XMLToJsonCommand implements Runnable  {

    @CommandLine.Mixin
    private FileIOParameters fileIOParameters;

    @CommandLine.Mixin
    private  XMLToJsonParameters xmlToJsonParameters;

    @Override
    public void run() {
        boolean wasSuccessful = executeConversion();
    }

    public boolean executeConversion() {
        try {
            XMLToJsonConverter converter = new XMLToJsonConverter();
            return converter.Convert(fileIOParameters.inputFile, fileIOParameters.outputFile, xmlToJsonParameters);
        }
        catch (IOException ioException) {
            System.out.println(ioException.getMessage());
            return false;
        }
    }
}
