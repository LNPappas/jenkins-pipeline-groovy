pipeline {
    agent any
    stages{
        stage("init") {
            steps {
                def rootDir = pwd()
                def pipe = load "${rootDir}@script/pipeline.groovy"
                pipe.initialize()
            }          
        }
    }
}