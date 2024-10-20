pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // GitHub에서 소스 코드 클론
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
                    def jarFilePath = "build/libs/movie-search-app.jar"
                    def imageName = "movie-search-app-image"
                    def containerName = "movie-search-app-container"

                    // 기존 컨테이너 삭제
                    sh "docker rm -f ${containerName} || true"

                    // 기존 이미지 삭제
                    sh "docker rmi ${imageName} || true"

                    // Docker 이미지를 빌드하여 JAR 파일 포함 (임시 Dockerfile 사용)
                    sh """
                        docker build -t ${imageName} - <<EOF
                        FROM openjdk:17-jdk-slim
                        COPY ${jarFilePath} /app.jar
                        ENTRYPOINT ["java", "-jar", "/app.jar"]
                        EOF
                    """

                    // Docker 컨테이너 생성 및 실행
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
