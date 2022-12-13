def call() {
	sh '''
		if ! command -v $POETRY &> /dev/null
                  then
                    echo "$POETRY could not be found"
                    exit
                  else
                    echo "$($POETRY --version) installed at : $(which $POETRY)"
                  fi
	'''
}
