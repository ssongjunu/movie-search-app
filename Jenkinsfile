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
                // gradlew 파일에 실행 권한 부여 후 빌드
                sh 'chmod +x ./gradlew'
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                // Gradle 테스트 실행
                sh './gradlew test'
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                script {
                    // 기존 Docker Compose 컨테이너 중지
                    sh 'docker-compose down || true'

                    // Docker Compose로 컨테이너 빌드 및 실행
                    sh 'docker-compose up --build -d'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and deployment were successful!'
        }
        failure {
            echo 'Build or deployment failed.'
        }
    }
}