def call() {
	activateCondaEnv()
	sh 'make install'
}
