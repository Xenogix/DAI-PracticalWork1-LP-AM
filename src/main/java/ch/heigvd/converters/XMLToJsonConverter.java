package ch.heigvd.converters;

import ch.heigvd.abstractions.IConverterBase;
import ch.heigvd.parameters.XMLToJsonParameters;

import java.io.IOException;

public class XMLToJsonConverter implements IConverterBase<XMLToJsonParameters> {
    @Override
    public boolean Convert(String inputFile, String outputFile, XMLToJsonParameters parameters) throws IOException {
        return false;
    }
}
