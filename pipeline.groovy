def getBranch() {
    return sh(
        script: "git rev-parse --abbrev-ref HEAD"
        returnStdout: true
    ).trim()
}
