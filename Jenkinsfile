pipeline {
    agent any
    stages{
        stage("init") {
            steps {
                script {
                    def rootDir = pwd()
                    def pipe = load "${rootDir}/pipeline.groovy"
                    pipe.initialize()
                }
            }          
        }
    }
}