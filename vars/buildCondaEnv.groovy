def call() {
	sh 'source ${CONDA_HOME}/etc/profile.d/conda.sh'
	sh 'make env.conda'
}
