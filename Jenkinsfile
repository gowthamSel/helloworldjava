currentBuild.displayName = "HelloWorld : "+currentBuild.number
pipeline {
    agent { label 'one' }  // Restrict the job to run on a node with the specified label

    stages {
      //   stage('Check out') {
        //   steps {
          //    echo "checkOut into the github and clone"
            //  git credentialsId: 'GITHUB', url: 'https://github.com/GowthamReddy-E/helloWorldJava.git'
        //    }
       // }
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
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
