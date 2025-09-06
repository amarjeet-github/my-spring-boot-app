pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/amarjeet-github/my-spring-boot-app.git'
            }
        }
        stage('Build') {
            steps {
                echo "Building the cicddemo project..."
                // For Maven
                bat 'mvn clean install'
                // Or if it’s Node.js
                // bat 'npm install && npm run build'
            }
        }
        stage('Test') {
            steps {
                echo "Running tests..."
                // Add your test commands here
            }
        }
        stage('Build Docker Image') {
            steps {
                echo "Building Docker image..."
                bat "docker build -t my-springboot-app:latest ."
            }
        }
        stage('Push Docker Image') {
            steps {
                echo "Pushing Docker image to Docker Hub..."
                // Make sure DOCKER_HUB_PASSWORD is stored as Jenkins secret
                withCredentials([string(credentialsId: 'docker-hub-password', variable: 'DOCKER_HUB_PASSWORD')]) {
                    bat """
                        docker login -u amarjeetdoc -p %DOCKER_HUB_PASSWORD%
                        docker tag my-springboot-app amarjeetdoc/my-springboot-app:latest
                        docker push amarjeetdoc/my-springboot-app:latest
                    """
                }
            }
    }
}
}