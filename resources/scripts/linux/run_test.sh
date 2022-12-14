#!/bin/bash
source "${CONDA_HOME}/etc/profile.d/conda.sh"
conda activate "${CONDA_ENV}"
source /usr/local/Modules/init/profile.sh
module load clinica.all
cd test
poetry run pytest \
	--junitxml=./test-reports/$3 \
	--verbose \
	--working_directory=$WORK_DIR \
	--input_data_directory=$INPUT_DATA_DIR \
	--basetemp=$TMP_DIR \
	--disable-warnings \
	--timeout=0 \
	-n $2 \
	$1
