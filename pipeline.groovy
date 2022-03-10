def call() {
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
                        //     returnStatus: true
                        // )
                        println branch
                    }
                }
            }
        }
    }
}
