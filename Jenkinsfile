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
                        sh "scp -o StrictHostKeyChecking=no ./target/helloWorldJava-0.0.1-SNAPSHOT.jar root@192.168.17.223:/root/"
                    }
                    echo 'Deploying...'
                }
            }
        }
        */

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
