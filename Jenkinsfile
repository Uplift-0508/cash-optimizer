pipeline {
    agent any

    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/Uplift-0508/cash-optimizer.git',
                branch: 'main'
            }
        }
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
//         stage("Code Coverage") {
//             steps {
//                 sh "./gradlew jacocoTestReport"
//                 publishHTML (
//                     target: [
//                         reportDir: 'build/reports/jacoco/test/html',
//                         reportFiles: 'index.html',
//                         reportName: 'JaCoCo Report'
//                     ]
//                 )
//                 sh "./gradlew jacocoTestCoverageVerification"
//             }
//         }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('Uplift SonarQube Server') { // Will pick the global server connection you have configured
                    sh './gradlew sonarqube'
                }
            }
        }
        stage("Quality Gate"){
            steps {
                timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}