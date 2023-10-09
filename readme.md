# DAI Practical work 1

## Authors
[Polien Lionel](https://github.com/polionel) and [Menétrey Arthur](https://github.com/xenogix)

## User guide
This software is a Java-based CLI that allows you to convert a Json file into XML and vice versa, and therefore includes the following commands :

| Command   |           Purpose           |
|:----------|:---------------------------:|
| XMLToJson | Converts a XML file to Json |
| JsonToXML | Converts a Json file to XML |
| help      | Shows the list of commands  |

In order to run the program you can download [the compiled .jar file](build/JConvert_20231008_release.jar) or clone this repo and build it yourself using maven.

Then run the following command in a command prompt taking care of filling the placeholders :

```
java -jar [file path of the compiled .jar] [XMLToJson/JsonToXML] -f [inputFile] -o [outputFile]
```

If the conversion was done successfully you should get a result similar to this :

<sup>(In the following examples we are using the JsonToXML command)</sup>

```
The conversion from Json to XML was done successfully
Time elapsed : 184ms
```

If an error occurs, an explicit error message will be written :

```
[Explicit error message...]
The conversion from Json to XML failed unexpectedly
Time elapsed : 115ms
```

In the case of a Json / XML parsing error, the specific line and column causing the error will be specified allowing you to debug your file more easily.
In this example we tried to convert an XML file to Json with the wrong command (JsonToXML) :

```
Unexpected character ('<' (code 60)): expected a valid value (JSON String, Number, Array, Object or token 'null', 'true' or 'false')
at [Source: (File); line: 1, column: 2]
The conversion from Json to XML failed unexpectedly
Time elapsed : 156ms
```

## Commands parameters

| Name |   FullName    | Purpose                                                   |
|:-----|:-------------:|:----------------------------------------------------------|
| -f   |    --file     | Specify the input file path                               |
| -o   |   --output    | Specify the output file path                              |
| -i   | --indentation | Indicate whether the output file should be indented       |
| -h   |    --help     | Shows a list of the parameters and how to use the command |
| -V   |   --version   | Print the current version of the command                  |

By default, the generated output file is indented but this can be specified using the indentation parameter.

## Build the project using Maven

In order to build this project manually you need to install [maven](https://maven.apache.org/) and complete [the installation process](https://maven.apache.org/install.html).

If you need to troubleshoot when trying to install of maven, we recommend you to directly check on their website. [Maven Getting started Guide](https://maven.apache.org/guides/getting-started/index.html)

After the installation completed, open a command prompt in the root folder of the project and type the following command in order to build the project to a JAR file including all the depedencies.

Note that a JAR containing only the classes and code of the project is built, whose name begins with "original".
In order to run the CLI you need to use the "executable" version and not the "original" one.

```
mvn dependency:resolve clean compile package
```
<sup>Note that you need to be in the project's root folder in order for it to work</sup>
<sup>(you can use the command "cd [path]" to select a location on most common OS</sup>

If the process was successfull, you will find the compiled JAR file in the project "target" directory.


## Depedencies

This project was built and tested using the following depedencies. Feel free to use other versions of the depedencies 
but keep in mind this could cause errors when building / running the program. You can edit the depedencies in the [pom.xml](pom.xml) file

| Depedency              |   URL                                                                                      | Version |
|:-----------------------|:-------------------------------------------------------------------------------------------|:-------:|
| picocli                | https://mvnrepository.com/artifact/info.picocli/picocli                                    | 4.7.5   |
| jackson-dataformat-xml | https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml | 2.15.2  |
| jackson-databind       | https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind             | 2.15.2  |


