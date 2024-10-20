pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // 소스 코드 클론
                git url: 'https://github.com/ssongjunu/movie-search-app.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // gradlew 파일에 실행 권한 부여 및 빌드
                sh 'chmod +x ./gradlew'
                sh './gradlew clean build'
            }
        }

        stage('Check JAR File') {
            steps {
                // 빌드 후 JAR 파일이 존재하는지 확인
                sh 'ls -l ./build/libs/'
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
                // 기존 Docker Compose 컨테이너 중지 및 새로운 컨테이너 빌드 후 실행
                sh 'docker-compose down || true'  // 기존 컨테이너 중지
                sh 'docker-compose up --build -d'  // 새로운 이미지로 컨테이너 실행
            }
        }
    }

    post {
        success {
            // 성공 시 Docker 컨테이너 상태 확인
            sh 'docker ps'
            echo 'Build, tests, and deployment were successful!'
        }
        failure {
            echo 'Build, tests, or deployment failed.'
        }
    }
}