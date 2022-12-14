#!/bin/bash
source "${CONDA_HOME}/etc/profile.d/conda.sh"
conda activate "${CONDA_ENV}"
source "${BREW_PREFIX}/opt/modules/init/bash"
module load clinica.all
cd test
poetry run pytest \
	--verbose \
	--working_directory=$WORK_DIR \
	--input_data_directory=$INPUT_DATA_DIR \
	--basetemp=$TMP_BASE \
	--junitxml=./test-reports/$3 \
	--disable-warnings \
	-n $2 \
	$1
