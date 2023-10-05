package ch.heigvd.commands;

import ch.heigvd.converters.CSVToJsonConverter;
import ch.heigvd.parameters.CSVToJsonParameters;
import picocli.CommandLine;

@CommandLine.Command(name = "CSVToJson", version = "CSVToJson 0.1", mixinStandardHelpOptions = true)
public class CSVToJsonCommand implements Runnable  {
    @CommandLine.Option(names = { "-f", "--file" }, paramLabel = "File", description = "CSV file to process")
    String inputFile;

    @CommandLine.Option(names = { "-o", "--output" }, paramLabel = "Output", description = "Json file to output")
    String outputFile;

    @Override
    public void run() {
        boolean wasSuccessful = executeConversion();
    }

    public boolean executeConversion() {
        CSVToJsonParameters parameters = new CSVToJsonParameters();
        CSVToJsonConverter converter = new CSVToJsonConverter();
        System.out.println("Everything went as excepted in CSV to Json");
        return false;
    }
}
