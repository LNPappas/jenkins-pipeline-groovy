pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    def branch = sh "git rev-parse --abbrev-ref HEAD"
                    println "This is the ${branch} branch"
                }
            }
        }
    }
}