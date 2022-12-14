def call() {
	sh 'source ${CONDA_HOME}/etc/profile.d/conda.sh'
	sh 'conda env create -p ${CONDA_ENV}'	
}
