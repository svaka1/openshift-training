pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat "mvn -version"
            }
        }
        stage('test') {
            steps {
                echo "Hi, building the app...."
            }
        }
    }
}