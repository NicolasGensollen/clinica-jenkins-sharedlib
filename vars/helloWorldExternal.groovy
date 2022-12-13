def call(Map config = [:]) {
	loadLinuxScript(name: "hello_world.sh")
	sh "./hello_world.sh ${config.name} ${config.dayOfWeek}"
}
