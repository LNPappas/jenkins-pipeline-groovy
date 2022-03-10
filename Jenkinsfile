node {
    stages{
        stage("build") {
            steps {
                echo "building... "
                // withGroovy {
                //     sh 'groovy --version'
                // }
                script {
                    def rootDir = pwd()
                    def pipe = load "${rootDir}/pipeline.groovy"
                    pipe.call()
                }
            }          
        }
    }
}