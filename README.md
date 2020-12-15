create new branch with local changes.<br>
git checkout -b new_branch_name
#This is a kafka consumer listening  for topic name "first_topic"
# mymdbk8s Spring Boot with Kafka
* Run This on machine not inside k8s cluster.

# To Run Kafka locally. Run below commands.
docker network create foo

docker run --network=foo -e ZOOKEEPER_CLIENT_PORT=2181 --name zookeeper confluent/zookeeper

docker run --network=foo -p 9092:9092 --name kafka  -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1  confluent/kafka

docker ps

# To create a Topic inside Kafka
docker exec -it kafka bash
kafka-topics --zookeeper zookeeper:2181 --list
kafka-topics --zookeeper zookeeper:2181 --create --topic first_topic --replication-factor 1 --partitions 1
kafka-topics --zookeeper zookeeper:2181 --list

kafka-console-producer --broker-list localhost:9092 --topic first_topic<br>
type some message then ctrl+c



kubectl port-forward hello-podname 8080