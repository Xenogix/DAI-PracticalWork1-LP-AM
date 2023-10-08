package ch.heigvd.parameters;

import picocli.CommandLine;

public class JsonToXMLParameters {
    @CommandLine.Mixin
    public FormattingParameters formattingParameters;
}
