#!/bin/bash
source "${CONDA_HOME}/etc/profile.d/conda.sh"
make env.conda
conda activate "${CONDA_ENV}"
conda info
