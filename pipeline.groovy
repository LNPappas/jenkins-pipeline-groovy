def call(kwargs) {
    pipeline {
        agent any
        stages {
            stage("initialize"){
                steps {
                    script {
                        GIT_REF = sh(
                            script: "git rev-parse --abbrev-ref HEAD"
                            returnStatus: true
                        )
                        println GIT_REF
                    }
                }
            }
        }
    }
}
