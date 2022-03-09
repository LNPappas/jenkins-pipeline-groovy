pipeline {
    agent any
    stages{
        stage("init") {
            steps {
                pipe = load 'pipeline.groovy'
                pipe.initialize()
            }          
        }
    }
}