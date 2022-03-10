node {
    stage("Build"){
        echo "building"
        script {
            def rootDir = pwd()
            sh "echo ${rootDir}"
            def pipe = load "pipeline.groovy"
            pipe.call()
        }
    }
}