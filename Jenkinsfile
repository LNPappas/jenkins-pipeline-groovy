def pipeline
    node('slave') {
        def rootDir = pwd()
        def pipe = load "${rootDir}/pipeline.groovy"
        pipe.initialize()
    }


// node {
//     agent any
//     stages{
//         stage("init") {
//             steps {
//                 script {
//                     def rootDir = pwd()
//                     def pipe = load "${rootDir}/pipeline.groovy"
//                     pipe.initialize()
//                 }
//             }          
//         }
//     }
// }