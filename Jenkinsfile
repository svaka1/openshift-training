pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh "mvn -version"
            }
        }
        stage('test') {
            steps {
                echo "Hi, building the app...."
            }
        }
    }
}