# Advanced Programming - Laboratory 5

## Tasks
```text
Media Catalog
Write an application that can manage a catalog of multimedia items. An entry in this catalog might be a song, a movie, a book, an image or any item that has at least a name and a path in the local file system. (We may also consider specifying a release year, a rating and other additional data, for example the author of the book, etc.)

The main specifications of the application are:


```
COMPULSORY
```text
Create an object-oriented model of the problem. You should have at least the following classes: Catalog and two item classes at your choice. Consider using an interface or an abstract class in order to describe the items in a catalog.
Implement the following methods representing commands that will manage the content of the catalog:
add: adds a new entry into the catalog;
list: prints the content of the catalog on the screen;
play: playback using the native operating system application (see the Desktop class);
save: saves the catalog to an external file (either as a text or binary, using object serialization);
load: loads the catalog from an external file.
The application will signal invalid data (year, path, etc.) using a custom exception.

```
OPTIONAL
```text
Create a shell that allows reading commands from the keyboard, together with their arguments.
Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.
Implement the commands add, list, save, load, play (create the classes AddCommand, ListCommand, etc.).
Implement the command report: create (and open) an HTML report representing the content of the catalog.
Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
The application will signal the commands that are not valid using a custom exception.
The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR.
```

## Solved tasks

As of today (22.03.2021) I have solved all tasks regarding the compulsory task.

## Build and run

To compile and run my project I have typed the following commands in the terminal:
```bash
javac -classpath . *.java Main.java
java compulsory.Main
```

## Output

The output for the compulsory part is:
```bash
Item{id='67', name='Hollywood hills', location='D:\catalog\song1.mp3'}
Item{id='23', name='My photo', location='D:\catalog\caption.jpg'}
Item{id='67', name='Hollywood hills', location='D:\catalog\song1.mp3'}
```


