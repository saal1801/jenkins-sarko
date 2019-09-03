pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'

            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

        post {
            always {
                junit 'target/surefire-reports/*.xml'
                publishHTML([
                allowMissing    : false,
                alwaysLinkToLastBuild : false,
                keepAll : true,
                reportDir : 'target/site/jacoco',
                reportFiles : 'index.html',
                reportTitles : "Tests coverage",
                reportName : "Tests coverage"
                ])
            }
            success {
                archive "target/fortuneteller.war"
            }
        }
}