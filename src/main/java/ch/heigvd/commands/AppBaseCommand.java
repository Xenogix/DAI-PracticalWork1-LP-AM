package ch.heigvd.commands;

import picocli.CommandLine;

@CommandLine.Command(name = "JConvert",
        subcommands = { XMLToJsonCommand.class, JsonToXMLCommand.class, CommandLine.HelpCommand.class },
        description = "Converts from or to Json for the given file format")
public class AppBaseCommand {
}
