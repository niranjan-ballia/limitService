node {
   def mvn = tool (name: 'maven-3.6.3', type: 'maven') + '/bin/mvn'
    stage('SCM Checkout'){ 
	git 'https://github.com/niranjan-ballia/limitService'
   
   }
   stage('Mvn Package'){
	   // Build using maven
	   
	   sh "${mvn} clean package"
   }
   stage('deploy-dev'){
       def tomcatDevIp = '23.20.56.214'
	   def tomcatHome = '/opt/tomcat/'
	   def webApps = tomcatHome+'webapps/'
	   def tomcatStart = "${tomcatHome}bin/startup.sh"
	   def tomcatStop = "${tomcatHome}bin/shutdown.sh"
	   sh "ssh ec2-user@${tomcatDevIp} ${tomcatStop}"
           sh "ssh ec2-user@${tomcatDevIp} ${tomcatStart}"
   }
}
