pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    String dir = pwd()
                    sh "echo ${dir}"
                    sh "ls -a"
                    // def branch = getBranch()
                    // println "Current branch: ${branch}"
                }
            }
        }
    }
}

def getBranch() {
    return sh(
        '''
        script: "git rev-parse --abbrev-ref HEAD"
        returnStdout: true
        '''
    ).trim()
}