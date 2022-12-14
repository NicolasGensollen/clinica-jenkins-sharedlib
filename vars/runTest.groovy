def call(Map config = [:]) {
	loadLinuxScript(name: "run_test.sh")
	sh "./run_test.sh ${config.name} ${config.n_jobs} ${config.junit}"
}
