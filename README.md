# alertmanager-demo

Run

./gradlew bootRun

OpenAPI

http://localhost:8080/swagger-ui.html

Prometheus
http://localhost:8080/actuator/prometheus


Simulate 

STATUS_CODE=400
curl -X 'GET'   "http://localhost:8080/status/$STATUS_CODE"   -H 'accept: */*' -v


Stack

| Service      | URL                                           |
|--------------|-----------------------------------------------|
| grafana      | [3000](http://localhost:3000)                 |
| app          | [8080](http://localhost:8080/swagger-ui.html) |
| prometheus   | [9090](http://localhost:9090)                 |
| alertmanager | [9093](http://localhost:9093)                 |


### Ref

* https://awesome-prometheus-alerts.grep.to/rules.html