package ch.heigvd.parameters;

import picocli.CommandLine;

/**
 * Represents parameters for controlling the formatting conversion.
 */
public class FormattingParameters {
    @CommandLine.Option(names = {"-i", "--indentation"}, paramLabel = "Indentation", description = "Conversion with indentation")
    public boolean indentation = true;
}
