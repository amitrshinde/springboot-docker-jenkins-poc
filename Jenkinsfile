pipeline{
    agent any
    tools{
            maven 'Maven-3.9.1'
    }
    stages{
        stage("Check Environment Variables"){
            steps{
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            }
        }
        stage("Maven Build"){
            steps{
                sh "mvn clean package"
                sh "cd target"
                sh "ls -ltr"
            }
        }
    }
}