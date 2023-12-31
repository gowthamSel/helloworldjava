pipeline {
    agent any

    environment {
        REMOTE_SERVER = 'user@remote-server'
    }

    stages {
        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: 'YOUR_CREDENTIALS_ID', keyFileVariable: 'SSH_KEY', passphraseVariable: 'SSH_PASSPHRASE')]) {
                    sh '''
                        scp -i $SSH_KEY -o StrictHostKeyChecking=no ./your-file.txt $REMOTE_SERVER:/path/to/destination/
                    '''
                }
            }
        }
    }
}
