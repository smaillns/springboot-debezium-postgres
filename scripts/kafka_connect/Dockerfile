# Use the Confluent Kafka Connect image as the base
FROM confluentinc/cp-kafka-connect:7.0.1

# Set the environment variables for Kafka Connect
ENV CONNECT_BOOTSTRAP_SERVERS=kafka:9092
ENV CONNECT_REST_ADVERTISED_HOST_NAME=kafka-connect
ENV CONNECT_GROUP_ID=kafka-connect
ENV CONNECT_CONFIG_STORAGE_TOPIC=connect-configs
ENV CONNECT_OFFSET_STORAGE_TOPIC=connect-offsets
ENV CONNECT_STATUS_STORAGE_TOPIC=connect-status
ENV CONNECT_KEY_CONVERTER=org.apache.kafka.connect.json.JsonConverter
ENV CONNECT_VALUE_CONVERTER=org.apache.kafka.connect.json.JsonConverter
ENV CONNECT_INTERNAL_KEY_CONVERTER=org.apache.kafka.connect.json.JsonConverter
ENV CONNECT_INTERNAL_VALUE_CONVERTER=org.apache.kafka.connect.json.JsonConverter
ENV CONNECT_PLUGIN_PATH=/usr/share/java,/etc/kafka-connect/jars

# Copy the Debezium Postgres connector configuration
COPY debezium-postgres-connector.json /kafka/connect/debezium-postgres-connector.json

# Expose the Kafka Connect REST API port
EXPOSE 8083

# Start Kafka Connect in distributed mode
CMD ["bash", "-c", "connect-distributed /etc/kafka/connect-distributed.properties"]
