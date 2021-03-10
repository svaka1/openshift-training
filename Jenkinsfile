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
                echo "Branch name is ${BRANCH_NAME}"
            }
        }
        stage('Image build') {
            steps {
                echo "Building ......."
            }
        }
    }
}