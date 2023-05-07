pipeline{
    agent any
    tools{
            maven 'Maven 3.9.0'
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