package ch.heigvd.parameters;

import picocli.CommandLine;

/**
 * Class tha
 */
public class FileIOParameters {
    @CommandLine.Option(names = { "-f", "--file" }, paramLabel = "File", description = "XML file to process", required = true)
    public String inputFile;

    @CommandLine.Option(names = { "-o", "--output" }, paramLabel = "Output", description = "Json file to output", required = true)
    public String outputFile;
}
