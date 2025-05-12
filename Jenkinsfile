pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git url: 'https://github.com/ssongjunu/movie-search-app.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Copy to Deploy Directory') {
            steps {
                sh '''
                    DEPLOY_DIR=/home/junu/docker_data/movie-app
                    mkdir -p $DEPLOY_DIR
                    cp build/libs/*.jar $DEPLOY_DIR/movie-search-app.jar
                '''
            }
        }

        stage('Deploy Docker Compose') {
            steps {
                script {
                    sh 'docker-compose down || true'
                    sh 'docker-compose up --build -d'
                }
            }
        }
    }

    post {
        success {
            echo 'Build, tests, and deployment were successful!'
        }
        failure {
            echo 'Build, tests, or deployment failed.'
        }
    }
}