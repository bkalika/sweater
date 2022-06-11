#!/usr/bin/env bash

mvn clean package

echo 'Copy files...'

scp -i ~/.ssh/id_ed25519 \
  target/sweater-1.0-SNAPSHOT.jar \
  bohdan@192.168.0.107:/home/bohdan/

echo 'Restart server...'
ssh -i ~/.ssh/id_ed25519 bohdan@192.168.0.107 << EOF

pgrep java | xargs kill -9
nohup java -jar sweater-1.0-SNAPSHOT.jar > log.txt &

EOF

echo 'Bye'
