# JMX proxy via ActiveMQ Testing

Project tests interlok-jmx-activemq features

## What it does

This project contains a single instance of Interlok that will launch an embedded ActiveMQ server and attempt to the broker upon start-up.  Once started a message will be created and bridged every 10 seconds.  However this project is more interested in showing how you might use JMS as the messaging proxy for JMX.
Here we'll be using ActiveMQ as that messaging proxy.
Once set up you'll be able to communicate with your Interlok instances via JMS rather JMXMP.
 
![activemq diagram](/activemq.png "activemq diagram")
 
## Getting started

* `./gradlew clean build`
* `(cd ./build/distribution && java -jar lib/interlok-boot.jar)`

## Configuring the client side

Our client will simply be the UI, which will usually communicate to instances via JMXMP.  Add a new instance on the dashboard page and set the following properties;
 - __url__ = jmxserviceurl=service:jmx:activemq:///tcp://localhost:61616?jmx.type=Topic&jmx.destination=jmxTopic
