pipeline {
  agent any
  stages {
	stage('Unit Test') {
	   steps {
	       bat label: 'Test running', script: '''mvn test'''
	       echo 'Hello Testing done'
       }
   	}
 	stage('SonarQube'){
       steps{
           bat label: '', script: '''mvn sonar:sonar \
		 -Dsonar.host.url=http://localhost:9000 \
 		-Dsonar.login=0459057998d94b15b228c7382db1eb66'''
       }
   }
	stage('Maven Build'){
		steps{
				bat label:'Maven Build of war file', script:'''
					mvn clean install -DskipTests=true
					mvn package
				'''
		}
	}  

    
    
  }
}