pipeline {
    agent { label 'two' }

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
        
        stage('Move To agentTwo') {
            steps {
                script {
                    sshagent(['agentOne']) {
                        sh "scp -o StrictHostKeyChecking=no  root@192.168.17.223"
                        sh "scp ./target/helloWorldJava-0.0.1-SNAPSHOT.jar root@192.168.17.223:/home"
                    }
                    echo 'Deploying...'
                }
            }
        }
        

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
