# mvn-play-oracle-glassfish
Study example for NetCracker

Full project, without .gitignore ^^


### maven-glassfish-plugin
Check config to match your glassfish settings

### MVN:
`mvn package` generates war
`mvn glassfish:deploy` deploys war to server

### Run app in browser:
`http://127.0.0.1:8080/user-1/showuser/id`
Change id on desired userid from database