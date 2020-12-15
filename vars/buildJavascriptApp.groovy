def call(Map config=[:], Closure body) {
    node {
        git url: "https://github.com/werne2j/sample-nodejs"
        stage("Install") {
            echo " install"
        }
        stage("Test") {
            echo " test"
        }
        stage("Deploy") {
            echo "Deploy : ${config.deploy}"
            echo "Values: ${config.values}"
            
        }
        body()
    }
}