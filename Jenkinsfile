/* Requires the Docker Pipeline plugin */
pipeline {
    agent {
        docker {
            image 'node:20.11.1-alpine3.19'
            // Ensure the directory paths are correctly formatted for Docker on Windows
            args '-v /c/Users/alterego/.jenkins/workspace/pipeline_master/:/workspace'
        }
    }
    environment {
        WORKSPACE_DIR = '/workspace'
    }
    stages {
        stage('build') {
            steps {
                dir("${WORKSPACE_DIR}") {
                    sh 'node --version'
                }
            }
        }
    }
}
