package ch.heigvd.parameters;

import picocli.CommandLine;

/**
 * Represents parameters for formatting XML-to-JSON conversion operations.
 */
public class XMLToJsonParameters {
    @CommandLine.Mixin
    public FormattingParameters formattingParameters;
}
