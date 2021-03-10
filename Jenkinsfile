pipeline {
    agent any
    environment {
    NAME = 'Sarat Vaka'
    NUMBER = '7661866440'
    }
    parameters {
       string(name: 'VERSION',defaultValue: '1.9',description:'This is version')
       choice(name:'CHOICE',choices:['Sarat','bharat','Gnanesh'], description:'This is choice')
    }
    stages {
        stage('build') {
            steps {
                echo "My name is ${NAME} and number is ${NUMBER} "
                echo "Build Number is ${BUILD_ID}"
                echo "Version is ${VERSION} and built by ${CHOICE}"
            }
        }
        stage('Image build') {
            steps {
                echo "Building ......."
            }
        }
    }
}