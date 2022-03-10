def call(kwargs) {
    pipeline {
        agent any
        stages {
            stage("initialize"){
                steps {
                    script {
                        def branch = sh(
                            script: "git rev-parse --abbrev-ref HEAD"
                            returnStatus: true
                        )
                        println branch
                    }
                }
            }
        }
    }
}
