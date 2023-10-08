package ch.heigvd.commands;

import picocli.CommandLine;

import java.util.concurrent.TimeUnit;

/**
 * Class that encapsulate commands logic
 */
@CommandLine.Command(name = "JConvert",
        subcommands = { XMLToJsonCommand.class, JsonToXMLCommand.class, CommandLine.HelpCommand.class },
        description = "Converts from or to Json for the given file format")
public class AppBaseCommand {
    public static void main(String[] args) {
        AppBaseCommand app = new AppBaseCommand();
        int exitCode = new CommandLine(app)
                .setExecutionStrategy(app::executionStrategy)
                .execute(args);
        System.exit(exitCode);
    }

    /**
     * Execute the user input
     *
     * @param parseResult The parse result from which to select one or more CommandSpec instances to execute.
     * @return An exit code
     */
    private int executionStrategy(CommandLine.ParseResult parseResult) {
        long startNanoTime = System.nanoTime();
        int exitCode = new CommandLine.RunLast().execute(parseResult);
        long elapsedNanoTime = System.nanoTime() - startNanoTime;
        System.out.println(getElapsedTimeToShow(elapsedNanoTime));
        return exitCode;
    }

    /**
     * Get the elapsed time of the execution
     *
     * @param nanoElapsedTime The time to execute the command
     * @return A string to display
     */
    private String getElapsedTimeToShow(long nanoElapsedTime)
    {
        String result = "Time elapsed : ";
        if(nanoElapsedTime < 1000)
            return result + nanoElapsedTime + "ns";
        else if(nanoElapsedTime < 1000000)
            return result + TimeUnit.NANOSECONDS.toMicros(nanoElapsedTime) + "us";
        else if(nanoElapsedTime < 1000000000)
            return result + TimeUnit.NANOSECONDS.toMillis(nanoElapsedTime) + "ms";
        else return result + TimeUnit.NANOSECONDS.toSeconds(nanoElapsedTime) + "s";
    }
}