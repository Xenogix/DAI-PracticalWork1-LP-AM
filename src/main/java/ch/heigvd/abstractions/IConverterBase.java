package ch.heigvd.abstractions;

import java.io.IOException;

/**
 * Interface to convert an input file to an output file
 *
 * @param <T> type of parameters
 */
public interface IConverterBase<T> {
    /**
     * Convert the data of the input file to the output file.
     *
     * @param inputFile The path of the input file to be converted.
     * @param outputFile The path of the ouput file where the converted data will be stored.
     * @param parameters An object containing the different format parameters.
     * @throws IOException If an error occurs during file I/O operations or the conversion process.
     */
    void Convert(String inputFile, String outputFile, T parameters) throws IOException;
}