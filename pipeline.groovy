pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    def GIT_REF = 'main'
                    // def GIT_REF = sh(
                    //     script: "git rev-parse --abbrev-ref HEAD"
                    //     returnStatus: true
                    // )
                    println $GIT_REF
                }
            }
        }
    }
}