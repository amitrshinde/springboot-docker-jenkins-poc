pipeline{
    agent any
    stages{
        stage("Check Environment Variables"){
            steps{
                echo "PATH = ${PATH}"
                sh "mvn clean package"
            }
        }
    }
}