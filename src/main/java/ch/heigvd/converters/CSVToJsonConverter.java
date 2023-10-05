package ch.heigvd.converters;

import ch.heigvd.abstractions.IConverterBase;
import ch.heigvd.parameters.CSVToJsonParameters;

import java.io.IOException;

public class CSVToJsonConverter implements IConverterBase<CSVToJsonParameters> {
    @Override
    public boolean Convert(String inputFile, String outputFile, CSVToJsonParameters parameters) throws IOException {
        return false;
    }
}
