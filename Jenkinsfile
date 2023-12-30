pipeline {
    agent { label 'two' }   
    environment {
        MAVEN_HOME = '/opt/apache-maven-3.9.6'
        PATH = "${MAVEN_HOME}/bin:${env.PATH}"
    }
    stages {         
        stage('clean') {
            steps {
                echo 'Building...'
                sh 'mvn build'
            }
        }    
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn build'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn build'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
