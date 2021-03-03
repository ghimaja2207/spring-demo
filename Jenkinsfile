pipeline{
	agent any
	tools{
		maven 'MAVEN_HOME'
		jdk 'jdk8'
	}
	stages{
	
		stage('Code Checkout'){
			steps{
				git branch: 'master', url : 'https://github.com/ghimaja2207/spring-demo.git'
				echo 'Code Checkout'
			}
		} 
		
		stage('Maven Build'){
			steps{
				bat "mvn -Dmaven.test.failure.ignore=true clean package"
				echo 'Building'
			}
		}
		stage('Test'){
			stages{
				echo 'Testing..'
			}
		}
	}
}