Test functions from the command line
************************************************
Start the spring boot application (mvn spring-boot:run)
>
Terminal Window >
>

String functions
--------------------
curl -H "Content-Type: text/plain" localhost:4080/toUpperCase -d ankur
curl -H "Content-Type: text/plain" localhost:4080/reverse -d ankur
curl -H "Content-Type: text/plain" localhost:4080/toLowerCase -d "ANKUR ISRanI"

#This one is not working.
curl -H "Content-Type: text/plain" localhost:4080/length -d "ankur"

Employee functions
------------------------
curl -H "Content-Type: text/plain" localhost:4080/all
curl -H "Content-Type: text/plain" localhost:4080/remove -d 1
curl -H "Content-Type: text/plain" localhost:4080/add -d "{\"id\": \"6\",\"name\":\"aaa\",\"address\": \"irving\"}"

UpperCaseStringHandler
----------------------------
curl -H "Content-Type: text/plain" localhost:4080/upperCaseStringHandler -d ankur

LowerCaseStringHandler
----------------------------
curl -H "Content-Type: text/plain" localhost:4080/lowercase -d ANKUR

BoodAddHandler
-----------------
curl -H "Content-Type: text/plain" localhost:4080/bookAddHandler -d "{\"id\": \"6\",\"name\":\"sidney\",\"author\": \"ankur\"}"

Reference
****************
https://www.youtube.com/watch?v=6A9pqr4qQMo&t=4s

https://www.youtube.com/watch?v=Bj_5U7h_Ri0

https://www.baeldung.com/spring-cloud-function

https://github.com/spring-cloud/spring-cloud-function/tree/master/spring-cloud-function-samples/function-sample-aws
https://docs.spring.io/spring-cloud-function/docs/3.0.8.RELEASE/reference/html/aws.html#_getting_started
