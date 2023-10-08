package ch.heigvd.parameters;

import picocli.CommandLine;

public class XMLToJsonParameters {
    @CommandLine.Mixin
    public FormattingParameters formattingParameters;
}
