pipeline {
    agent any

    triggers {
        pollSCM('* * * * *')
    }

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
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        stage("Package") {
            steps {
                sh "./gradlew build"
            }
        }
        stage("Docker build") {
            steps {
                sh "docker build -t uplift-0508/cash-optimizer ."
            }
        }
        stage("Docker push") {
            steps {
                sh "docker push uplift-0508/cash-optimizer"
            }
        }
        stage("Deploy to staging") {
            steps {
                sh "docker run -d --rm -p 8765:8080 --name cash-optimizer uplift-0508/cash-optimizer"
            }
        }
    }
    post {
        always {
            sh "docker stop cash-optimizer"
        }
    }
}