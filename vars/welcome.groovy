def call(Map config = [:]){
	echo "Hello ${config.name}. Today is ${config.dayOfWeek}"
	echo "We will create a folder for you at ${config.homeFolder}"
	sh "mkdir -p ${config.homeFolder}"
	sh "ls"
	echo "CONDA_HOME = ${CONDA_HOME}"
}
