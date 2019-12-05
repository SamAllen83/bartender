#!/usr/bin/env bash
mvn clean install -DskipTest -Dspring.cloud.contract.verifier.skip=true -DskipTests
docker build -t localhost:32000/bartender-api .
docker push localhost:32000/bartender-api