# DAI Practical work 1

## Authors :
[Polien Lionel](https://github.com/polionel) and [Menétrey Arthur](https://github.com/xenogix)

## User guide :
This software is a java based CLI which allows you to convert a Json file to XML and vice versa and thus include the following commands :

| Command   |           Purpose           |
|:----------|:---------------------------:|
| XMLToJson | Converts a XML file to Json |
| JsonToXML | Converts a Json file to XML |
| help      | Shows the list of commands  |

In order to use the program you can use the compiled .jar file and run it as it follows or clone this repo and build it yourself

Then run the following command in a command prompt taking care of filling the placeholders :

```
java -jar [file path of the buid] [XMLToJson/JsonToXML] -f [inputFile] -o [outputFile] [
```

You can find the complete list of parameters right bellow.

### Commands parameters :

| Name |   FullName    | Purpose                                                   |
|:-----|:-------------:|:----------------------------------------------------------|
| -f   |    --file     | Specify the output file path                              |
| -o   |   --output    | Specify the input file path                               |
| -i   | --indentation | Indicate whether the output file should be indented       |
| -h   |    --help     | Shows a list of the parameters and how to use the command |
| -V   |   --version   | Print the current version of the command                  |


