def call() {
	loadLinuxScript(name: "install_package.sh")
	sh "./install_package.sh"
}
