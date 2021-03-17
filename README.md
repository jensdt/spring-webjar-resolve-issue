Steps to reproduce:

1. Download JBoss EAP 7.3
2. Build this project (mvn package)
3. Deploy by dropping the .war file in the jboss_home/standalone/deployments directory
4.
a) Navigate to http://localhost:8080/webjar-resource-resolver-example-0.0.1-SNAPSHOT/: you'll see swagger-ui/index.html is resolved to swagger-ui/3.45.0/index.html
b) Alternatively, navigate to http://localhost:8080/webjar-resource-resolver-example-0.0.1-SNAPSHOT/webjars/swagger-ui/index.html : this works

5. Change the version of the swagger-ui dependency to something else (e.g. 3.44.0) and bump the version number of this project.
6. Build this project (mvn package)
7. Deploy by dropping the .war file in the jboss_home/standalone/deployments directory alongside the other deployment.
8.
a) Navigate to http://localhost:8080/webjar-resource-resolver-example-0.0.2-SNAPSHOT/: you'll see swagger-ui/index.html is no longer resolved
b) Alternatively, navigate to http://localhost:8080/webjar-resource-resolver-example-0.0.2-SNAPSHOT/webjars/swagger-ui/index.html : this no longer works

The issue only occurs when both projects are deployed (and the last one deployed is impacted, the first one is fine).