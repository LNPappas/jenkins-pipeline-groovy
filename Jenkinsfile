pipeline {
    agent any
    stages {
        stage("initialize"){
            steps {
                script {
                    sh "git checkout main"
                    sh "git branch"
                    sh "-d"
                    sh "ls"
                    def branch = sh(returnStdout:true, script:"git rev-parse --abbrev-ref HEAD")
                    println "Current branch: ${branch}"

                }
            }
        }
        stage ("directory"){
            steps {
                script {
                    String mainDir = pwd()
                    dir("${mainDir}/orgs") {
                        def status = false
                        def directories = findFiles().findAll{ file -> file.directory }
                        directories.each { directory ->
                        dir(directory.name){
                            echo "directory: ${directory.name}"                          
                            status = dir(".files/modules") {
                                sh(returnStatus:true, script:"git status .files/modules --porcelain")
                            }
                            
                        }
                        println "status is: ${status}"
                        if (status == true) {
                            println "Error: changes made in modules folder"
                        }
                        }
                    }
                }
            }
        }
    }
}