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

        stage('Deploy Docker Container') {
            steps {
                script {
                    def imageName = "movie-search-app-image"
                    def containerName = "movie-search-app-container"

                    // 기존 Docker 컨테이너 삭제
                    sh "docker rm -f ${containerName} || true"

                    // 기존 Docker 이미지 삭제 후 다시 빌드
                    sh "docker rmi ${imageName} || true"

                    // Docker 이미지 빌드 (Dockerfile 사용)
                    sh "docker build -t ${imageName} ."

                    // 새로운 Docker 컨테이너 실행
                    sh "docker run -d --name ${containerName} -p 8080:8080 ${imageName}"
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