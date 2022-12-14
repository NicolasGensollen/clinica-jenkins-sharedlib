def call(Map config = [:]) {
	def scriptcontents = libraryResource "scripts/mac/${config.name}"
	writeFile file: "${config.name}", text: scriptcontents
	sh "chmod a+x ./${config.name}"
}
