pipeline {
    agent any
    stages{
        stage("init") {
            steps {
                script {
                    def rootDir = pwd()
                    def pipe = load "${rootDir}@script/pipeline.groovy"
                    pipe.initialize()
                }
            }          
        }
    }
}