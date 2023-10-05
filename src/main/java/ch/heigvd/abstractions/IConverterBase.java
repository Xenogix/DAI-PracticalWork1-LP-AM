package ch.heigvd.abstractions;

import java.io.IOException;

public interface IConverterBase<T> {
    boolean Convert(String inputFile, String outputFile, T parameters) throws IOException;
}
