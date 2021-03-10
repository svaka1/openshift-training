pipeline {
    agent any
    environment {
    NAME = 'Sarat Vaka'
    NUMBER = '7661866440'
    GITCREDS = credentials('GitHubCreds')
    }
    stages {
        stage('build') {
            steps {
                echo "My name is ${NAME} and number is ${NUMBER} "
                echo "Build Number is ${env.BUILD_ID}"
                echo "${GITCREDS}"
            }
        }
        stage('Image build') {
            steps {
                echo "Building ......."
            }
        }
    }
}