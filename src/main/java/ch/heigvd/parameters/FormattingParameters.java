package ch.heigvd.parameters;

import picocli.CommandLine;

public class FormattingParameters {
    @CommandLine.Option(names = {"-i", "--indentation"}, paramLabel = "Indentation", description = "Conversion with indentation")
    public boolean indentation = true;
}
