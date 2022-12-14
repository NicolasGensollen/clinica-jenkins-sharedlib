#!/bin/bash
if ! command -v $1 &> /dev/null
then
	echo "$1 could not be found"
	exit
else
	echo "$($1 --version) installed at : $(which $1)"
fi
