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
                // Gradle 빌드를 위한 실행 권한 부여 및 빌드
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

        stage('Set Permissions') {
            steps {
                // JAR 파일에 읽기 권한 부여
                sh 'chmod 644 build/libs/movie-search-app.jar'
            }
        }

        stage('Deploy Docker Compose') {
            steps {
                script {
                    // Docker Compose를 사용해 컨테이너 배포
                    sh 'docker-compose down || true' // 기존 컨테이너 종료
                    sh 'docker-compose up --build -d' // 새로운 컨테이너 빌드 및 실행
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