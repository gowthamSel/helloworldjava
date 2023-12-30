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
                sh 'mvn clean'
            }
        }    
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn clean test'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
