# Lab 11: Spring for Full-Stack Web Apps 

## There are 3 routes: 
*  "/hello", "capitalize/word", "/albums .
- "/hello" renders the page to say "Hello World!"
- "/capitalize/word" takes in a word and capitalizes that when loaded.
- "/albums" I tshows three album of songs with [title,artist,songCount,length and imageUrl ] instances when loaded.


# How to run it

Clone the repo: https://github.com/AyaaBe95/songr-.git
Testing from terminal:

## cd to songr-
- run the following command: './gradlew test'
- All the tests should pass.
- 
## Testing from IJ:

- Via import project, choose "songr"
- run the following command: './gradlew test'
- All the tests should pass.


## Running from browser:

- cd to songr and run the application
- Go to browser and type "localhost:8181/hello"
- * The page should display "Hello World!"
- Now type "localhost:8181/capitalize/word"
- * The page should display "HELLO"
- type "localhost:8181/albums"
- * The page should display 3 Albums of song
