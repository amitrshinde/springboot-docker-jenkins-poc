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

            }
        }

        stage("Build Docker Image"){
            agent{
                    docker { image 'node:18.16.0-alpine' }
            }
            steps{
                sh "docker build -t springboot-docker-jenkins-poc:latest ."
            }
        }
    }
}