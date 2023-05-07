pipeline{
    agent any
    stages{
        stage("Check Environment Variables"){
            steps{
                echo 'PATH = ${PATH}'
                sh 'M2_HOME = ${M2_HOME}'
            }
        }
    }
}