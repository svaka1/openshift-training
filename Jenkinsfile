pipeline {
    agent any
    environment {
    NAME = 'Sarat Vaka'
    NUMBER = '7661866440'
    }
    stages {
        stage('build') {
            steps {
                echo "My name is ${NAME} and number is ${NUMBER} "
                echo "Build Number is ${env.BUILD_ID}"
                withCredentials([
                     usernamePassword(credentialsId: 'GitHubCreds', usernameVariable: 'USER', passwordVariable: 'PWD')
                     ]) {
                     echo "${USER}"
                     echo "${PWD}"
                }
            }
        }
        stage('Image build') {
            steps {
                echo "Building ......."
            }
        }
    }
}