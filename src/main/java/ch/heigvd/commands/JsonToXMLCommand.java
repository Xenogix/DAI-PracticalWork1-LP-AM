package ch.heigvd.commands;

import ch.heigvd.converters.JsonToXMLConverter;
import ch.heigvd.parameters.FileIOParameters;
import ch.heigvd.parameters.JsonToXMLParameters;
import picocli.CommandLine;

import java.io.IOException;

@CommandLine.Command(name = "JsonToXML", version = "JsonToXML 0.1", mixinStandardHelpOptions = true)
public class JsonToXMLCommand implements Runnable {

    @CommandLine.Mixin
    private FileIOParameters fileIOParameters;

    @CommandLine.Mixin
    private  JsonToXMLParameters jsonToXMLParameters;

    @Override
    public void run() {
        boolean wasSuccessful = executeConversion();
        if(!wasSuccessful) System.out.println("The conversion from Json to XML failed unexpectedly");
        else System.out.println("The conversion from Json to XML was done successfully");
    }

    public boolean executeConversion() {
        try {
            JsonToXMLConverter converter = new JsonToXMLConverter();
            converter.Convert(fileIOParameters.inputFile, fileIOParameters.outputFile, jsonToXMLParameters);
            return true;
        }
        catch (IOException ioException) {
            System.out.println(ioException.getMessage());
            return false;
        }
    }
}
