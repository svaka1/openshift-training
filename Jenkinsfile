pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "Hi, building the app...."
            }
        }
        stage('test') {
            when {
               expression {
                    BRANCH_NAME == 'master'
               }
            }
            steps {
                echo "Hi, building the app...."
            }
        }
    }
}