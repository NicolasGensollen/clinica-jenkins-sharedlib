def call(Map config = [:]) {
	loadLinuxScript(name: "check_command.sh")
	sh "./check_command.sh ${config.name}"
}
