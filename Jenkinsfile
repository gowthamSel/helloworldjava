// currentBuild.displayName = "HelloWorld : " + currentBuild.number
pipeline {
    agent any
    stages {
        // Uncomment the following stage if needed
        /*
        stage('clean') {
            steps {
                echo 'Building...'
                sh 'mvn clean'
            }
        }
        */

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

        // Uncomment the following stage if needed
        /*
        stage('Move To agentTwo') {
            steps {
                script {
                    sshagent(['agentOne']) {
                        sh "scp -
