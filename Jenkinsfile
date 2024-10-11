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
        stage('Deploy Docker Container') {
            steps {
                script {
                    def imageName = "movie-search-app-image"
                    def containerName = "movie-search-app-container"

                    // 기존 컨테이너가 존재할 경우 삭제
                    sh "docker rm -f ${containerName} || true"

                    // 기존 이미지를 삭제 후 다시 빌드
                    sh "docker rmi ${imageName} || true"

                    // Docker 이미지를 빌드 (Dockerfile 사용)
                    sh "docker build -t ${imageName} ."

                    // 새로운 Docker 컨테이너 생성 및 실행
                    sh "docker run -d --name ${containerName} -p 8081:80 ${imageName}"
                }
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
