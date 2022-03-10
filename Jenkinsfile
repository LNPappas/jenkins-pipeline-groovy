pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    def branch = pipeline.getBranch()
                    println "Current branch: ${branch}"
                }
            }
        }
    }
}