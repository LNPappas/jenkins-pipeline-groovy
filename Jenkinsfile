node {
    stage("Build"){
        echo "building"
        script {
            def rootDir = pwd()
            def pipe = load "${rootDir}/pipeline.groovy"
            pipe.call()
        }
    }
}