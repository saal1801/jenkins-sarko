pipeline {
    agent any
    parameters {
        choice(name: 'DEPLOYMENT_ENVIRONMENT', choices: ['Build', 'Archive', 'Test'], description: 'The target environment to deploy artifacts')
    }

    stages {
        stage('Build') {
            agent {
                docker {
                    image 'maven:3-alpine'
                }
            }
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    publishHTML([
                            allowMissing         : false,
                            alwaysLinkToLastBuild: false,
                            keepAll              : true,
                            reportDir            : 'target/site/jacoco/',
                            reportFiles          : 'index.html',
                            reportTitles         : "Tests coverage",
                            reportName           : "Tests coverage"
                    ])
                }
                success {
                    archiveArtifacts(artifacts: 'target/ALM2.war', onlyIfSuccessful: true)
                }
                cleanup{
                        deleteDir()
                }
            }
        }
        stage('Deploy to env') {
            agent {
                docker {
                    image 'maven:3-alpine'
                }
            }
            steps {
                sh 'mvn compile war:war'
            }
        }
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '3'))
    }
}