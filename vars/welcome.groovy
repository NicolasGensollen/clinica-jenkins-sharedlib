def call(Map config = [:]){
	echo "Hello ${config.name}. Today is ${config.dayOfWeek}"
	echo "We will create a folder for you at ${config.homeFolder}"
	sh "mkdir ${config.homeFolder}"
	sh "ls"
}
