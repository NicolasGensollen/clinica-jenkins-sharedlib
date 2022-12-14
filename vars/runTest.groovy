def call(Map config = [:]) {
	if (config.os == "linux") {
		loadLinuxScript(name: "run_test.sh")
	} else if (config.os == "mac") {
		loadMacScript(name: "run_test.sh")
	}
	sh "./run_test.sh ${config.name} ${config.n_jobs} ${config.junit}"
}
