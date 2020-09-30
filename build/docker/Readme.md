# jenkins in docker

based on the jenkins/jenkins:lts  
A ready to go jenkins for development.  
Builds the product and execute the rcptt gui tests 

* Xvfb installed for rcptt gui test
* rcptt runner
* open jdk

all necessary plugins installed, build job added  
configured via casc (Configuration as Code)



build the image:

docker build -t test:01   ./ 

run the image

docker run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home  test:01

