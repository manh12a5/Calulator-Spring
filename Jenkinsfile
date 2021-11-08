pipeline {
    agent any
        tools {
            gradle 'Gradle 6.9.1'
            jdk 'JDK8'
        }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/manh12a5/Calulator-Spring.git'
                bat 'gradle clean'
            }
        }
        stage('Test') {
            steps {
                bat 'gradle build'
            }
        }
    }

    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}