package ch.heigvd.parameters;

import picocli.CommandLine;

public class FormattingParameters {
    @CommandLine.Option(names = {"-i", "--indentation"}, paramLabel = "Indentation", description = "Conversion with indentation")
    public String indentation;

    @CommandLine.Option(names = {"-u", "--upperCase"}, paramLabel = "UpperCase", description = "Write in upper case")
    public String upperCase;

    @CommandLine.Option(names = {"-l", "--lowerCase"}, paramLabel = "LowerCase", description = "Write in lower case")
    public String lowerCase;
}
