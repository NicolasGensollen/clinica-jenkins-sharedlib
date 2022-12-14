def call() {
	checkCommand(name: "poetry")
	buildCondaEnv()
	activateCondaEnv()
}
