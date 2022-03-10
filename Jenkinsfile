pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    String dir = pwd()
                    sh "echo ${dir}"
                    sh "git checkout main"
                    sh "git branch"
                    def branch = sh(returnStdout:true, script:"git rev-parse --abbrev-ref HEAD")
                    println "Current branch: ${branch}"
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