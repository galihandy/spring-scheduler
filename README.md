# spring-scheduler

Simple project to testing Spring Scheduler (https://spring.io/guides/gs/scheduling-tasks/).
The task will update user profile description every 5 seconds by appending `desc` text with datetime in `HH:mm:ss` format.

## Setup

### DB

I use PostgreSQL with the following configuration :
- DB name = `test`
- port = `5433`
- username = `postgres`
- password = `postgres`
You can edit the db configurations in `application.properties` file.

## Run

1. execute

```groovy
gradlew bootRun
```

2. Hit every 5 seconds

```
localhost:8080/profiles
```
Response : list of user profiles with updated `description` attribute.
