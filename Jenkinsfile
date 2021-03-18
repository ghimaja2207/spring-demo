pipeline{
	agent any
	tools{
		maven 'MAVEN_HOME'
		jdk 'jdk8'
	}
	stages{
		
		stage('Code Checkout'){
			steps{
				echo 'This is master'
				git branch: '${params.branch}', credentialsId : 'd3285e6a-d788-4932-84b2-bcfd690e792e', url : 'https://github.com/ghimaja2207/spring-demo.git'
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
