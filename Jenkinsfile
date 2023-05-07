pipeline{
    agent any
    tools{
            maven 'Maven-3.9.1'
    }
    stages{
        stage("Check Environment Variables"){
            steps{
                echo "PATH = ${PATH}"
                sh "mvn clean package"
            }
        }
    }
}