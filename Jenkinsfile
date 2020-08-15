node {
   def mvn = tool (name: 'maven-3.6.3', type: 'maven') + '/bin/mvn'
    stage('SCM Checkout'){ 
	url: 'https://github.com/niranjan-ballia/limitService'
   
   }
   stage('Mvn Package'){
	   // Build using maven
	   
	   sh "${mvn} clean package"
   }
}
