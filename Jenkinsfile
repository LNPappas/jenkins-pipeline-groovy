pipeline {
    agent any
    environment {
        branch = getGitRepoURL()
    }
    stages {
        stage("initialize"){
            steps {
                script {
                    // def branch = sh(
                    //     script: "git rev-parse --abbrev-ref HEAD"
                    // )
                    println "This is the ${branch} branch"
                }
            }
        }
    }
}