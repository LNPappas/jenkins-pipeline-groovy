pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                def GIT_REF = sh(
                    script: "git rev-parse --abbrev-ref HEAD"
                    returnStatus: true
                )
                println $GIT_REF
            }
        }
    }
}