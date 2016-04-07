Hi, this is my solution to GoEuro, I hope you enjoy !

To build use maven 
==================

mvn install

and to run
==========

cd target
java -jar app-1.0.0.jar Aosta

Below the result of build that you are expected to see.

Regards !

[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building app 1.0.0
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ app ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/giuseppe/workspace-mars-crossover/app/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ app ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ app ---
[INFO] Surefire report directory: /home/giuseppe/workspace-mars-crossover/app/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running goeuro.app.CityInfoServiceTest
07:25:36.025 [main] DEBUG goeuro.app.CityInfoProvider - reading city info from internet...
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.181 sec
Running goeuro.app.CityInfoProviderTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ app ---
[INFO] Building jar: /home/giuseppe/workspace-mars-crossover/app/target/app-1.0.0.jar
[INFO] META-INF/maven/goeuro/app/pom.xml already added, skipping
[INFO] META-INF/maven/goeuro/app/pom.properties already added, skipping
[INFO] 
[INFO] --- maven-shade-plugin:2.4.3:shade (default) @ app ---
[INFO] Including junit:junit:jar:4.12 in the shaded jar.
[INFO] Including org.hamcrest:hamcrest-core:jar:1.3 in the shaded jar.
[INFO] Including org.apache.commons:commons-lang3:jar:3.4 in the shaded jar.
[INFO] Including org.apache.commons:commons-collections4:jar:4.1 in the shaded jar.
[INFO] Including org.glassfish.jersey.media:jersey-media-moxy:jar:2.22.1 in the shaded jar.
[INFO] Including org.glassfish.jersey.core:jersey-common:jar:2.22.1 in the shaded jar.
[INFO] Including javax.ws.rs:javax.ws.rs-api:jar:2.0.1 in the shaded jar.
[INFO] Including javax.annotation:javax.annotation-api:jar:1.2 in the shaded jar.
[INFO] Including org.glassfish.jersey.bundles.repackaged:jersey-guava:jar:2.22.1 in the shaded jar.
[INFO] Including org.glassfish.hk2:hk2-api:jar:2.4.0-b31 in the shaded jar.
[INFO] Including org.glassfish.hk2:hk2-utils:jar:2.4.0-b31 in the shaded jar.
[INFO] Including org.glassfish.hk2.external:aopalliance-repackaged:jar:2.4.0-b31 in the shaded jar.
[INFO] Including org.glassfish.hk2.external:javax.inject:jar:2.4.0-b31 in the shaded jar.
[INFO] Including org.glassfish.hk2:hk2-locator:jar:2.4.0-b31 in the shaded jar.
[INFO] Including org.javassist:javassist:jar:3.18.1-GA in the shaded jar.
[INFO] Including org.glassfish.hk2:osgi-resource-locator:jar:1.0.1 in the shaded jar.
[INFO] Including org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.22.1 in the shaded jar.
[INFO] Including org.eclipse.persistence:org.eclipse.persistence.moxy:jar:2.6.0 in the shaded jar.
[INFO] Including org.eclipse.persistence:org.eclipse.persistence.core:jar:2.6.0 in the shaded jar.
[INFO] Including org.eclipse.persistence:org.eclipse.persistence.asm:jar:2.6.0 in the shaded jar.
[INFO] Including javax.validation:validation-api:jar:1.1.0.Final in the shaded jar.
[INFO] Including org.glassfish:javax.json:jar:1.0.4 in the shaded jar.
[INFO] Including org.apache.logging.log4j:log4j-api:jar:2.4.1 in the shaded jar.
[INFO] Including org.apache.logging.log4j:log4j-core:jar:2.4.1 in the shaded jar.
[INFO] Replacing original artifact with shaded artifact.
[INFO] Replacing /home/giuseppe/workspace-mars-crossover/app/target/app-1.0.0.jar with /home/giuseppe/workspace-mars-crossover/app/target/app-1.0.0-shaded.jar
[INFO] Dependency-reduced POM written at: /home/giuseppe/workspace-mars-crossover/app/dependency-reduced-pom.xml
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ app ---
[INFO] Installing /home/giuseppe/workspace-mars-crossover/app/target/app-1.0.0.jar to /home/giuseppe/.m2/repository/goeuro/app/1.0.0/app-1.0.0.jar
[INFO] Installing /home/giuseppe/workspace-mars-crossover/app/dependency-reduced-pom.xml to /home/giuseppe/.m2/repository/goeuro/app/1.0.0/app-1.0.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 10.015 s
[INFO] Finished at: 2016-04-07T07:25:44-03:00
[INFO] Final Memory: 28M/294M
[INFO] ------------------------------------------------------------------------
