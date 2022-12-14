#!/bin/bash

source "${CONDA_HOME}/etc/profile.d/conda.sh"
conda activate "${CONDA_ENV}"

source "${BREW_PREFIX}/opt/modules/init/bash"
module load clinica.all

cd test

if [ "$2" != "all" ];
then
	mark_option=-m $2
else
	mark_option=""
fi

poetry run pytest \
	--verbose \
	--working_directory=$WORK_DIR \
	--input_data_directory=$INPUT_DATA_DIR \
	--basetemp=$TMP_DIR \
	--junitxml=./test-reports/$4 \
	--disable-warnings \
	-n $3 \
	$mark_option \
	$1
