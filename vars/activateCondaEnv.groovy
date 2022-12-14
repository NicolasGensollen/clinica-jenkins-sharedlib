def call() {
	sh 'conda activate ${CONDA_ENV}'
	sh 'conda info'
}
