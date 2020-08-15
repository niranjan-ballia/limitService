node {
   def mvn = tool (name: 'maven-3.6.3', type: 'maven') + '/bin/mvn'
   stage('Mvn Package'){
	   // Build using maven
	   
	   sh "${mvn} clean package"
   }
}
