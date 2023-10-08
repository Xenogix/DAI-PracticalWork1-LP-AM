package ch.heigvd.parameters;

import picocli.CommandLine;

/**
 * Represents parameters for formatting JSON-to-XML conversion operations.
 */
public class JsonToXMLParameters {
    @CommandLine.Mixin
    public FormattingParameters formattingParameters;
}
