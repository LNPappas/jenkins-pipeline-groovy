pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    def branch = sh(
                        script: "git rev-parse --abbrev-ref HEAD"
                        returnStdout: true
                    ).trim()
                    println "Current branch: ${branch}"
                }
            }
        }
    }
}