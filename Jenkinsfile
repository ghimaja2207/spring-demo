pipeline{
	agent any
	tools{
		maven 'MAVEN_HOME'
		jdk 'jdk8'
	}
	stages{
		echo 'This is feature-branch'
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
			steps{
				echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				echo "test stage"
			}
		}
	}
}
