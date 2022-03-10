pipeline {
    agent any
    stages{
        stage("init") {
            steps {
                script {
                    def GIT_REF = 'main'
                    // def GIT_REF = sh(
                    //     script: "git rev-parse --abbrev-ref HEAD"
                    //     returnStatus: true
                    // )
                    println $GIT_REF
                    // def rootDir = pwd()
                    // def pipe = load "${rootDir}/pipeline.groovy"
                    // pipe.initialize()
                }
            }          
        }
    }
}