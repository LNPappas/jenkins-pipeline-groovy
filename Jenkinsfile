pipeline {
    agent any
    stages{
        stage("init") {
            steps {
                withGroovy {
                    sh 'groovy --version'
                }
                // script {
                //     def rootDir = pwd()
                //     def pipe = load "${rootDir}/pipeline.groovy"
                //     pipe.initialize()
                // }
            }          
        }
    }
}