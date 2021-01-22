Test functions from the command line
************************************************
Start the spring boot application
>
Terminal Window >
>

String functions
--------------------
curl -H "Content-Type: text/plain" localhost:4080/toUpperCase -d ankur
curl -H "Content-Type: text/plain" localhost:4080/reverse -d ankur
curl -H "Content-Type: text/plain" localhost:4080/toLowerCase -d "ANKUR ISRanI"


Employee functions
------------------------
curl -H "Content-Type: text/plain" localhost:4080/all
curl -H "Content-Type: text/plain" localhost:4080/remove -d 1
curl -H "Content-Type: text/plain" localhost:4080/add -d "{\"id\": \"6\",\"name\":\"aaa\",\"address\": \"irving\"}"


Reference
****************
https://www.youtube.com/watch?v=6A9pqr4qQMo&t=4s

https://www.baeldung.com/spring-cloud-function
