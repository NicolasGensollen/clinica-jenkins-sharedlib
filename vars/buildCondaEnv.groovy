def call() {
	sh 'source ${CONDA_HOME}/etc/profile.d/conda.sh'
	checkCommand(name: "conda")
	sh 'conda env create -p ${CONDA_ENV}'	
}
