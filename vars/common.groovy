def call(String stageName){
  if("${stageName}" == "Build"){
    sh "mvn clean package"
  }
  else if("${stageName}" == "Test"){
    sh "mvn sonar:sonar"
  }
  else if("${stageName}" == "End"){
    sh 'echo "Deployment done"'
  }
}
