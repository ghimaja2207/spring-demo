pipeline{
	agent any
	tools{
		maven 'MAVEN_HOME'
		jdk 'jdk8'
	}
	stages{
		stage('Maven Build'){
			step{
				bat "mvn -Dmaven.test.failure.ignore=true clean package"
			}
		}
	}
}