package ch.heigvd;

import ch.heigvd.commands.AppBaseCommand;
import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new AppBaseCommand()).execute(args);
        System.exit(exitCode);
    }
}