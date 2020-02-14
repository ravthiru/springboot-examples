#!/bin/sh

# This value has to come from Hostname , when we use statefulset
NODE_INDEX=1
 
echo "Using node index $NODE_INDEX"

if [ "$NODE_INDEX" = "1" ]; then
     cp /opt/conf/conf1.properties /opt/test/override.properties
elif [ "$NODE_INDEX" = "2" ]; then
     cp /opt/conf/conf2.properties /opt/test/override.properties
elif [ "$NODE_INDEX" = "3" ]; then
    cp /opt/conf/conf3.properties ./opt/test/override.properties
else
    echo "Invalid node index"
exit 1
fi

#exec java $JAVA_OPTS -jar /app.jar

exec java $JAVA_OPTS -jar /app.jar --spring.config.location=file:////opt/test/override.properties
