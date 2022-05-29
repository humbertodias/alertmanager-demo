# alertmanager-demo

# Run

docker-compose up


### OpenAPI

http://localhost:8080/swagger-ui.html

### Prometheus

http://localhost:8080/actuator/prometheus

Reset database
```
curl -X POST -g 'http://localhost:9090/api/v1/admin/tsdb/delete_series?match[]={}'
```

docker-compose restart app


### Grafana

http://localhost:3000/api/datasources


### Simulate 

STATUS_CODE=400
curl -X 'GET'   "http://localhost:8080/status/$STATUS_CODE"   -H 'accept: */*' -v

or

for i in {1..500}; do   echo "Command no. $i"; sh -c  "curl -XGET http://localhost:8080/status/400" ; sleep .5 ; done


### Stack

| Service      | URL                                           |
|--------------|-----------------------------------------------|
| grafana      | [3000](http://localhost:3000)                 |
| app          | [8080](http://localhost:8080/swagger-ui.html) |
| prometheus   | [9090](http://localhost:9090)                 |
| alertmanager | [9093](http://localhost:9093)                 |


### App-Run

./gradlew bootRun


### Ref

* https://awesome-prometheus-alerts.grep.to/rules.html
* https://api.slack.com/messaging/webhooks