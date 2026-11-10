
pipeline {
    agent any

    options {
        timestamps()
    }

    stages {

        stage('Build and Test') {
            steps {
                echo 'Building Spring Boot application...'
                sh 'chmod +x mvnw'
                sh './mvnw clean test package'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar',
                                 fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully!'
        }

        failure {
            echo 'Build failed. Please check the console output.'
        }
    }
}
