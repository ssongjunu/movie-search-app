pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // Git 저장소에서 코드 클론
                git url: 'https://github.com/ssongjunu/movie-search-app.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Gradle을 사용해 빌드
                sh './gradlew clean build'
            }
        }
        
        stage('Test') {
            steps {
                // Gradle을 사용해 테스트 실행
                sh './gradlew test'
            }
        }
    }

    post {
        success {
            // 빌드 및 테스트 성공 시 메시지
            echo 'Build and tests were successful!'
        }
        failure {
            // 빌드 또는 테스트 실패 시 메시지
            echo 'Build or tests failed.'
        }
    }
}
