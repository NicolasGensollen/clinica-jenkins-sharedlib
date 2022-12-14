def call() {
	loadLinuxScript(name: "build_conda_env.sh")
	sh "./build_conda_env.sh"
}
