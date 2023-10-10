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
        stage("Code Coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML (
                    target: [
                        reportDir: 'build/reports/jacoco/test/html',
                        reportFiles: 'index.html',
                        reportName: 'JaCoCo Report'
                    ]
                )
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
    }
}