#!/bin/bash

source "${CONDA_HOME}/etc/profile.d/conda.sh"
conda activate "${CONDA_ENV}"

source /usr/local/Modules/init/profile.sh
module load clinica.all

cd test

if [ "$2" != "all" ];
then
	mark_option=-m $2
else
	mark_option=""
fi

poetry run pytest \
	--junitxml=./test-reports/$4 \
	--verbose \
	--working_directory=$WORK_DIR \
	--input_data_directory=$INPUT_DATA_DIR \
	--basetemp=$TMP_DIR \
	--disable-warnings \
	--timeout=0 \
	$mark_option \
	-n $3 \
	$1
