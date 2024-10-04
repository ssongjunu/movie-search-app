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
    }

    post {
        success {
            echo 'Build and tests were successful!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
