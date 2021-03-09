pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat "mvn clean install"
            }
        }
        stage('test') {
            steps {
                echo "Testing the app...."
            }
        }
    }
}