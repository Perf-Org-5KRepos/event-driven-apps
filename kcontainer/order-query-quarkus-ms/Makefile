# Image URL to use all building/pushing image targets
IMG ?= eventingapps/order-query-ms
TAG ?= 1.0.0

# Run tests
test: 
	mvn compile
	echo "to be done"

# Build docker image
build-docker:
	mvn package -DskipTests
	docker build -f src/main/docker/Dockerfile.jvm -t ${IMG}:${TAG} .

# Push docker image
push-docker:
	echo "${DOCKER_PASSWORD}" | docker login -u "${DOCKER_USERNAME}" --password-stdin
	docker push ${IMG}:${TAG}

# Run locally
run:
	./mvnw compile quarkus:dev: -Ddebug=5005

# Run inner loop with Skaffold
dev:
	skaffold dev

deploy-on-knative:
	kubectl apply -k k8s/overlays/knative-eventing

deploy-on-es:
	kubectl apply -k k8s/overlays/es		
