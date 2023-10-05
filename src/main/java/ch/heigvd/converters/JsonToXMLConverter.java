package ch.heigvd.converters;

import ch.heigvd.abstractions.IConverterBase;
import ch.heigvd.parameters.JsonToXMLParameters;

import java.io.IOException;

public class JsonToXMLConverter implements IConverterBase<JsonToXMLParameters> {
    @Override
    public boolean Convert(String inputFile, String outputFile, JsonToXMLParameters parameters) throws IOException {
        return false;
    }
}
