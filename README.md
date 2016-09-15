# simple-app-with-discovery-client

Simple example application that connects to Service Registry (SCS)


## Create Service Registry service instance

```
cf marketplace -s p-service-registry
cf create-service p-service-registry standard my-service-registry
cf services
```

You will need to wait a minute or so, for the `my-service-registry` service to be created.

## Build the application

```
mvn clean install
```

## Deploy the application to PCF

```
cf push
```

## Observe the environment variables

```
cf env simple-app-with-discovery-client
```

## Observe the logs

```
cf logs simple-app-with-discovery-client
```

