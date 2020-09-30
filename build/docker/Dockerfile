FROM jenkins/jenkins:lts

USER root

RUN apt-get update
RUN apt-get -qqy --no-install-recommends install \
	xvfb \
	openjdk-8-jre \
	default-jre 
	

RUN rm -rf /var/lib/apt/lists/* /var/cache/apt/*

## configure jenkins
COPY ./jenkins-plugins /usr/share/jenkins/plugins

RUN while read i ; \
                do /usr/local/bin/install-plugins.sh $i ; \
        done < /usr/share/jenkins/plugins

#Update the username and password
ENV JENKINS_USER admin
ENV JENKINS_PASS u

#id_rsa.pub file will be saved at /root/.ssh/
RUN ssh-keygen -f /root/.ssh/id_rsa -t rsa -N ''

# allows to skip Jenkins setup wizard
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

# Jenkins runs all grovy files from init.groovy.d dir
# use this for creating default admin user
COPY default-user.groovy /usr/share/jenkins/ref/init.groovy.d/

# copy and set config
COPY jenkins-tools.yaml /var/jenkins_home/casc_configs/
ENV CASC_JENKINS_CONFIG /var/jenkins_home/casc_configs

#copyjob
COPY job.xml /usr/share/jenkins/ref/jobs/test/config.xml

VOLUME /var/jenkins_home        