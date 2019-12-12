@Library('my-shared-library') _

def call(){
	pipeline {
	agent any
	stages {
  
		stage('Checkout') {
			steps {
				GitCheckout(
					branch: "jenkins_conf",
					url: "https://github.com/medbelaziz/bookService.git"
					)
			}
		}

		stage('Build') { 
			steps {
				script{
					build.info("########## Build ###########")
				}
			} 
		}

		stage('Deploy') {
			parallel {
				stage('Deploy1') { steps { deploy( "Deploying1") } }
				stage('Deploy2') { steps { deploy( "Deploying2") } }
				stage('Deploy3') { steps { deploy( "Deploying3") } }
			}
		}

		stage('Test') { steps { test('Testing') } }
	}
	post {
		always { echo 'One way or another, I have finished' }
		success { echo 'I succeeeded!' }
		unstable { echo 'I am unstable :/' }
		failure { echo 'I failed :(' }
		changed { echo 'Things were different before...' }
	}
}

}

