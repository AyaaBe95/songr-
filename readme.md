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

# Lab 11: Spring for Full-Stack Web Apps 

## There are 3 routes: 
*  "/hello", "capitalize/word", "/albums .
- "/hello" renders the page to say "Hello World!"
- "/capitalize/word" takes in a word and capitalizes that when loaded.
- "/albums" It shows three album of songs with [title,artist,songCount,length and imageUrl ] instances when loaded.


# Lab 12: Spring and REST 

 * Album Model has been updated.
  - The Albums can be inserted into database.
  - user can see information about albums.
  - user can add any album into the site.
## routes
 * /addAlbums :enable you adding a new Album.
 * /albums :to see all albums in the site.

## properties
 * make sure run the server and create a new database then edit the properties file after cloning this respiratory in order to insert the data into database. 
   - spring.datasource.platform=postgres
   - spring.datasource.url=jdbc:postgresql://localhost:5432/database_name
   - spring.datasource.username=username
   - spring.datasource.password=password
   - spring.jpa.hibernate.ddl-auto=update
