FROM jenkins/jenkins:lts-jdk17

USER root

RUN apt-get update
RUN apt-get -qqy --no-install-recommends install \
	libswt-gtk-4-jni \
	icewm \
	locales \
	locales-all \
	libxtst6 \
	pandoc \
	xvfb 
	

RUN rm -rf /var/lib/apt/lists/* /var/cache/apt/*

#set local
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8


## configure jenkins
#COPY ./jenkins-plugins /usr/share/jenkins/plugins

COPY --chown=jenkins:jenkins jenkins-plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt

#Update the username and password is done in default-user.groovy
#ENV JENKINS_USER admin
#ENV JENKINS_PASS u

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
COPY branch_ci.xml /usr/share/jenkins/ref/jobs/shr5rcp-ci/config.xml

VOLUME /var/jenkins_home